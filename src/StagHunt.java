import java.util.*;

public class StagHunt  {
    public ArrayList<Leader> leaders = new ArrayList<>();
    public ArrayList<Follower> followers = new ArrayList<>();
    GeneralAssembly assembly = new GeneralAssembly();

    public ArrayList<ArrayList<Nation>>Blocks = new ArrayList<ArrayList<Nation> >();

    public void addNationPowers() {
        double num=0;
        for (Nation nation: assembly.nations){

            num+=nation.CalculatePower();

        }
        for (Nation nation: assembly.nations){
            nation.setPower(nation.getPower()/num);
        }
    }

    public void printNations() {
        assembly.printNations();
    }

    public void createLeaders() {
        for (Nation nation :assembly.nations ) {
            if (nation.getPower()>=0.005*1.9){
                System.out.printf(nation.getName()+"  %.2f\n",nation.getPower()*100);
                Leader leader = new Leader(nation.getName(), nation.getPower(),nation.getContinent());
                leaders.add(leader);}}
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
    public void printBlocks(){
        int i=0;
        int j=0;
        for (ArrayList<Nation>block:Blocks ){
            System.out.println("Block "+i+":");

            for (Nation nation:block){
                System.out.printf(" | "+nation.getName().toUpperCase());
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println(j);
    }


}
