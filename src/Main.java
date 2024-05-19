public class Main {
    public static void main(String[] args) {
        GeneralAssembly assembly = new GeneralAssembly();
        assembly.initiateConference();
        assembly.printPowers();
        assembly.selectIssue();
        System.out.println(assembly.getIssue().getName());

        // Generate inclinations for each nation
        StagHunt s = new StagHunt(assembly);

        s.addNationPowers();
        s.createLeaders();
        s.createFollowers();
        s.createRegionalBlocks();
        s.initializeInclinations();
        s.generateDiffThreshold();
        // 5 Rounds of discussion
        for (int i=0;i<5;i++){
            s.printBlocks();
            s.adjustNations();
        }
        assembly.endConference();

        System.out.println(assembly.nations.get(192).getInclination());

    }
}