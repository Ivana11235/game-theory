public class Main {
    public static void main(String[] args) {
        GeneralAssembly assembly = new GeneralAssembly();
        assembly.initiateConference();
        StagHunt s = new StagHunt(assembly);
        s.setAbbreviations();
        s.addNationPowers();
        s.createLeaders();
        s.createFollowers();
        s.createRegionalBlocks();
        s.initializeInclinations();
        s.generateDiffThreshold();
        s.startStagHunt();
        assembly.endConference();




    }
}