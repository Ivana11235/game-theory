import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        GeneralAssembly assembly=new GeneralAssembly();
        assembly.printPowers();
        assembly.selectIssue();
        System.out.println(assembly.getIssue().getName());
        StagHunt s=new StagHunt();
        s.addNationPowers();
        s.createLeaders();
        s.createFollowers();
        s.createRegionalBlocks();
        s.printBlocks();
        double f=0;
        for (Nation nation: assembly.nations){
            f+=nation.getCINC();
        }
        System.out.println(f);




    }
}