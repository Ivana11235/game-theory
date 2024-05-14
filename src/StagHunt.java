import java.util.ArrayList;

public class StagHunt {
    ArrayList<Leader> leaders = new ArrayList<>();
    ArrayList<Follower> followers = new ArrayList<>();
    GeneralAssembly assembly = new GeneralAssembly();

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
            if (nation.getPower()>=0.0051*2){

                System.out.printf(nation.getName()+"  %.2f\n",nation.getPower()*100);
                Leader leader = new Leader(nation.getName(), nation.getPower());
                leaders.add(leader);}}


    }

    public void printleaders(){
        for (Leader leader:leaders){
            System.out.println(leader.getName());
        }
    }
    public void createFollowers(){
        for (Nation nation :assembly.nations ) {
        if (nation.getPower()<0.0051*2){

            System.out.printf(nation.getName()+"  %.2f\n",nation.getPower()*100);
            Follower follower = new Follower(nation.getName(), nation.getPower());
            followers.add(follower);}}

    }
    public void printFollowers(){
        int z=0;
        System.out.println("Followers Are:");
        for (Follower follower:followers){
            System.out.println(follower.getName());
            z+=1;
        }
        System.out.println(z);
    }

    public void createRegionalBlocks(){


    }


    // Rest of the code...
}
