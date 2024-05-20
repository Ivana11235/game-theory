import java.util.*;

/**
 * The StagHunt class represents a simulation of the Stag Hunt game within a geopolitical context.
 * It brings together nations, leaders, and followers to simulate discussions, inclinations, and potential rebellions.
 * The simulation involves creating regional blocks, assigning followers to leaders, and adjusting inclinations based on power differentials.
 * The class provides methods to initialize and generate inclinations, simulate rebellion, and start the Stag Hunt simulation.
 */
public class StagHunt {
    public ArrayList<Leader> leaders = new ArrayList<>();
    public ArrayList<Follower> followers = new ArrayList<>();
    private GeneralAssembly assembly;
    public ArrayList<ArrayList<Nation>> Blocks = new ArrayList<ArrayList<Nation>>();
    private double incDiff;

    public StagHunt(GeneralAssembly assembly) {
        this.assembly = assembly;
    }

    public StagHunt() {

    }

    /**
     * Sets the abbreviations for all the nations in the assembly.
     */
    public void setAbbreviations() {
        for (Nation nation : assembly.nations) {
            nation.setAbbr();
        }
    }

    /**
     * Calculates the total power of all nations and assigns relative powers to each nation.
     */
    public void addNationPowers() {
        double num = 0;
        for (Nation nation : assembly.nations) {
            num += nation.calculatePower();
        }
        for (Nation nation : assembly.nations) {
            nation.setPower(nation.getPower() / num);
        }
    }

    /**
     * Generates a difference threshold for inclinations.
     */
    public void generateDiffThreshold() {
        Random rand = new Random();
        double minDiff = 0.1;
        double maxDiff = 0.4;
        this.incDiff = rand.nextDouble() * (maxDiff - minDiff) + minDiff;
    }

    /**
     * Returns the difference threshold for inclination of leader and follower.
     * @return The difference threshold.
     */
    public double getDiffThreshold() {
        return incDiff;
    }

    /**
     * Creates leaders based on the power of nations.
     */
    public void createLeaders() {
        for (Nation nation : assembly.nations) {
            if (nation.getPower() >= 0.005 * 1.8) {
                System.out.printf(nation.getName() + "  %.2f\n", nation.getPower() * 100);
                Leader leader = new Leader(nation.getName(), nation.getPower(), nation.getContinent());
                leaders.add(leader);
            }
        }
    }

    /**
     * Creates followers based on the power of nations.
     */
    public void createFollowers() {
        for (Nation nation : assembly.nations) {
            if (nation.getPower() < 0.005 * 1.9) {
                nation.isFollower = true;
                Follower follower = new Follower(nation.getName(), nation.getPower(), nation.getContinent());
                followers.add(follower);
            }
        }
    }

    /**
     * Creates regional blocks and assigns followers to leaders.
     */
    public void createRegionalBlocks() {
        Random rand = new Random();
        int z = 0;
        Collections.shuffle(leaders);
        Collections.shuffle(followers);
        for (Leader leader : leaders) {
            ArrayList<Nation> block = new ArrayList<Nation>();
            Blocks.add(block);
            block.add(leader);
        }

        while (z < followers.size()) {
            int n = rand.nextInt(leaders.size());
            int s = rand.nextInt(followers.size());
            if (followers.get(s).getLeader() == null) {
                if (followers.get(s).getContinent().equals(leaders.get(n).getContinent())) {
                    followers.get(s).setLeader(leaders.get(n));
                    Blocks.get(n).add(followers.get(s));
                    z++;
                }
            }
        }
    }

    /**
     * Initializes inclinations for each nation in the blocks.
     */
    public void initializeInclinations() {
        for (ArrayList<Nation> block : Blocks) {
            for (Nation nation : block) {
                nation.generateInclination();
            }
        }
    }

    /**
     * Initiates the discussion and rebellion process for each block.
     */
    public void beginDiscussion() {
        for (ArrayList<Nation> block : Blocks) {
            Rebellion(block, getDiffThreshold());
        }
    }

    /**
     * Generates inclinations for all nations in the assembly.
     */
    public void generateInclinations() {
        for (int i = 0; i < assembly.nations.size(); i++) {
            assembly.nations.get(i).generateInclination();
        }
    }

    /**
     * Simulates rebellion within a block based on the inclination difference threshold.
     * @param block The block to simulate rebellion within.
     * @param diffThreshold The threshold for inclination difference.
     * @return True if the number of rebels is greater than or equal to the minimum required rebels, false otherwise.
     */
    public boolean Rebellion(ArrayList<Nation> block, double diffThreshold) {
        Random rand = new Random();
        double totaldiff = 0;
        int rebels = 0;
        double changeRatio = 0;
        for (Nation nation : block){
            if (nation.isFollower) {
                double incDiff = Math.abs(nation.getInclination() - block.get(0).getInclination()); // Difference between follower and leader inclinations
                totaldiff += incDiff;
                if (incDiff > diffThreshold) {
                    nation.isRebel = true;
                    nation.rebelNum++;
                    rebels++;
                }
            }
        }

        int minimumRebels = (int) (Math.ceil((2.0/ 3.0) * (block.size() - 1)));

        for (Nation nation : block) {
            if (nation.isRebel) {
                double num = nation.getPower() / block.get(0).getPower();
                if (num > 0.1) {
                    changeRatio = 0.3;
                } else if (num > 0.01) {
                    changeRatio = 0.45;
                } else if (num > 0.001) {
                    changeRatio = 0.6;
                } else {
                    changeRatio = 0.75;
                }

                if (rebels >= minimumRebels) {
                    if (nation.getInclination() > block.get(0).getInclination()) {
                        nation.setInclination((1 + (1 - changeRatio)) * nation.getInclination());
                    } else {
                        nation.setInclination(changeRatio * nation.getInclination());
                    }
                } else {
                    nation.setInclination((block.get(0).getInclination() * changeRatio + (1 - changeRatio) * nation.getInclination()));
                }

                if (nation.getInclination() > 1) {
                    nation.setInclination(1);
                } else if (nation.getInclination() < 0) {
                    nation.setInclination(0);
                }
            }
        }
        return rebels >= minimumRebels;
    }

    /**
     * Adjusts the inclinations and rebellion status of the original nations based on the blocks.
     */
    public void adjustNations() {
        for (ArrayList<Nation> block : Blocks) {
            for (Nation nation : block) {
                for (int i = 0; i < assembly.nations.size(); i++) {
                    Nation originalNation = assembly.nations.get(i);
                    if (originalNation.getName().equals(nation.getName())) {
                        originalNation.setInclination(nation.getInclination());
                        originalNation.isRebel = nation.isRebel;
                        originalNation.rebelNum = nation.rebelNum;
                        break;
                    }
                }
            }
        }
    }

    /**
     * Starts the Stag Hunt simulation by initiating discussions and adjustments for a random number of rounds.
     */
    public void startStagHunt() {
        Random rand = new Random();
        int i = 0;
        int nRounds = rand.nextInt(10) + 1;
        do {
            beginDiscussion();
            adjustNations();
            i++;
        } while (i < nRounds);
    }
}