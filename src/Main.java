import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        GeneralAssembly assembly=new GeneralAssembly();
        assembly.printPowers();
        StagHunt s=new StagHunt();
        s.addNationPowers();
        s.createLeaders();
        s.printleaders();
        s.createFollowers();
        s.printFollowers();




    }
}