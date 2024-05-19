import java.util.*;

public class StagHunt  {
    public ArrayList<Leader> leaders = new ArrayList<>();
    public boolean rebellion;
    public ArrayList<Follower> followers = new ArrayList<>();
    private GeneralAssembly assembly;

    public ArrayList<ArrayList<Nation>>Blocks = new ArrayList<ArrayList<Nation> >();

    public ArrayList<Follower> BLockFollowers=new ArrayList<>();

    private double incDiff;
    public StagHunt(GeneralAssembly assembly){
        this.assembly=assembly;
    }
    public StagHunt (){

    }
    public void setAbbreviations(){
        for (Nation nation:assembly.nations){
            nation.setAbbr();
            System.out.println(nation.getAbbr());
        }
    }

    public void addNationPowers() {
        double num=0;
        for (Nation nation: assembly.nations){

            num+=nation.CalculatePower();

        }
        for (Nation nation: assembly.nations){
            nation.setPower(nation.getPower()/num);
            System.out.print(nation.getName()+" ");
            System.out.printf("%.6f\n",nation.getPower());
        }
    }
    public void addEconomicStrengths() {
        double num=0;
        for (Nation nation: assembly.nations){

            num+=nation.calculateEconomicStrength();

        }
        for (Nation nation: assembly.nations){
            nation.setEconomicStrength(nation.getEconomicStrength()/num);
            System.out.print("\n"+nation.getName());
            System.out.printf("%.5f ",nation.getEconomicStrength());
        }
    }

    public void generateDiffThreshold(){
        Random rand = new Random();
        double minDiff = 0.1;
        double maxDiff = 0.4;
        this.incDiff=rand.nextDouble() * (maxDiff - minDiff) + minDiff;
    }

    public double getDiffThreshold(){
        return incDiff;
    }

    public void printNations() {
        assembly.printNations();
    }

    public void createLeaders() {
        for (Nation nation :assembly.nations ) {
            if (nation.getPower()>=0.005*1.8){
                System.out.printf(nation.getName()+"  %.2f\n",nation.getPower()*100);
                Leader leader = new Leader(nation.getName(), nation.getPower(),nation.getContinent());
                leaders.add(leader);}
        }
    }

    public void printleaders(){
        for (Leader leader:leaders){
            System.out.println(leader.getName());
        }
    }
    public void createFollowers(){
        for (Nation nation :assembly.nations ) {
        if (nation.getPower()<0.005*1.9){

            System.out.printf(nation.getName()+"  %.2f\n",nation.getPower()*100);
            Follower follower = new Follower(nation.getName(), nation.getPower(),nation.getContinent());
            followers.add(follower);}}

    }


    public void printFollowers() {
        int z = 0;
        System.out.println("Followers Are:");
        for (Follower follower : followers) {
            System.out.println(follower.getName());
            z += 1;
        }
        System.out.println(z);

    }

    /*public void createRegionalBlocks() {
        for (Leader leader : leaders) {
            ArrayList<Nation> block = new ArrayList<Nation>();
            block.add(leader);
            for (Follower follower : followers) {
                System.out.println(follower.getLeader());
                if (follower.getLeader()==null){
                    if (follower.getContinent().equals(leader.getContinent())) {
                        follower.setLeader(leader);
                        block.add(follower);

                    } else {

                    }

            }}
            Blocks.add(block);
        }
    }*/
    public void createRegionalBlocks() {
        Random rand= new Random();
        int z=0;
        Collections.shuffle(leaders);
        Collections.shuffle(followers);
        for (Leader leader : leaders) {
            ArrayList<Nation> block = new ArrayList<Nation>();
            Blocks.add(block);
            block.add(leader);}

        while (z<followers.size()){
            int n= rand.nextInt(leaders.size());
            int s= rand.nextInt(followers.size());
            if (followers.get(s).getLeader()==null){
                if (followers.get(s).getContinent().equals(leaders.get(n).getContinent())) {
                followers.get(s).setLeader(leaders.get(n));
                Blocks.get(n).add(followers.get(s));
                z++;
                }
            }
        }
    }

    public void createEconomicBlocks() {
        Random rand = new Random();
        int z = 0;
        Collections.shuffle(leaders);
        Collections.shuffle(followers);

        // Create blocks for each leader
        for (Leader leader : leaders) {
            ArrayList<Nation> block = new ArrayList<Nation>();
            Blocks.add(block);
            block.add(leader);
        }

        // Assign followers to leaders based on economic strength
        while (z < followers.size()) {
            int n = rand.nextInt(leaders.size());
            int s = rand.nextInt(followers.size());
            if (followers.get(s).getLeader() == null) {
                if (Math.abs(followers.get(s).getEconomicStrength() - leaders.get(n).getEconomicStrength()) <= 0.00005) {
                    followers.get(s).setLeader(leaders.get(n));
                    Blocks.get(n).add(followers.get(s));
                    z++;
                }
            }
        }
    }
    public void initializeInclinations(){
        for (ArrayList<Nation>block:Blocks){
            for(Nation nation:block){
                nation.generateInclination();
            }
        }
    }
    public void printBlocks(){
        int i=0;
        int j=0;
        getDiffThreshold();
        for (ArrayList<Nation>block:Blocks ){
            System.out.println("Block "+i+":");

            for (Nation nation:block){
                System.out.printf(" | "+nation.getName().toUpperCase()+"  %.2f ",nation.getInclination());
                j++;
            }
            System.out.println("\n"+Rebellion(block,getDiffThreshold()));
            i++;
        }
        System.out.println(j);
    }

    public void generateInclinations(){
        for (int i=0;i<assembly.nations.size();i++){
            assembly.nations.get(i).generateInclination();
        }
    }
    public void startDiscussion(){

            printBlocks();

    }
    public void applyStagHunt(){

        for (ArrayList<Nation> block:Blocks){
            for (Nation nation : block) {
                double changeRatio;
                if (nation.isRebel){
                    double num=nation.getPower()/block.get(0).getPower();
                    if (num>0.1){
                        changeRatio=0.3;
                    }
                    else if (num>0.01){
                        changeRatio=0.45;
                    }
                    else if (num>0.001){
                        changeRatio=0.6;
                    }
                    else{
                        changeRatio=0.75;
                    }
                    if (Rebellion(block,getDiffThreshold())){
                        if (nation.getInclination()>block.get(0).getInclination()){
                            nation.setInclination((1+(1-changeRatio))*nation.getInclination());
                        }
                        else{
                            nation.setInclination(changeRatio*nation.getInclination());
                        }

                    }

                    else{
                        nation.setInclination((block.get(0).getInclination()*changeRatio+(1-changeRatio)*nation.getInclination()));
                    }

                    if (nation.getInclination()>1){
                        nation.setInclination(1);
                    }
                    else if (nation.getInclination()<0){
                        nation.setInclination(0);
                    }
                }
            }

        }
    }
    public boolean Rebellion(ArrayList<Nation>block, double diffThreshold) {
        Random rand = new Random();
        double totaldiff=0;
        int rebels = 0;
        double changeRatio = 0;
        for (Nation nation : block) {
            if (nation.isFollower) {
                double incDiff = Math.abs(nation.getInclination() - block.get(0).getInclination()); // Difference between follower and leader inclinations
                totaldiff+=incDiff;
                if (incDiff > diffThreshold) {
                    nation.isRebel=true;
                    rebels++;
                }
            }
        }

        System.out.printf("\nAccepted difference: %.2f \n",diffThreshold);
        System.out.println(rebels);
        int minimumRebels=(int)(Math.ceil((2.0/3.0) * (block.size()-1)));
        System.out.printf("%d",minimumRebels);
        for (Nation nation : block) {
            if (nation.isRebel){
                double num=nation.getPower()/block.get(0).getPower();
                if (num>0.1){
                    changeRatio=0.3;
                }
                else if (num>0.01){
                    changeRatio=0.45;
                }
                else if (num>0.001){
                    changeRatio=0.6;
                }
                else{
                    changeRatio=0.75;
                }
        if (rebels>=minimumRebels){
            if (nation.getInclination()>block.get(0).getInclination()){
                nation.setInclination((1+(1-changeRatio))*nation.getInclination());
            }
            else{
                nation.setInclination(changeRatio*nation.getInclination());
            }

        }

        else{
            nation.setInclination((block.get(0).getInclination()*changeRatio+(1-changeRatio)*nation.getInclination()));
        }

            if (nation.getInclination()>1){
                nation.setInclination(1);
            }
            else if (nation.getInclination()<0){
                nation.setInclination(0);
            }
        }}

        return rebels >= minimumRebels;
    }
    public void adjustNations() {
        for (ArrayList<Nation> block : Blocks) {
            for (Nation nation : block) {
                for (int i = 0; i < assembly.nations.size(); i++) {
                    Nation originalNation = assembly.nations.get(i);
                    if (originalNation.getName().equals(nation.getName())) {
                        originalNation.setInclination(nation.getInclination());
                        break;
                    }
                }
            }
        }
    }


}
