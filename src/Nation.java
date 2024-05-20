import java.util.Random;

/**
 * The Nation class represents a nation in the Stag Hunt simulation.
 * It encapsulates various attributes and behaviors of a nation, such as its name, power, inclination.
 * The class provides methods to initialize a nation, calculate power, and update power based on voting outcomes.
 */
public class Nation {
    private String name;
    public boolean isFollower;
    public String abbr;
    private String continent;
    private double gdp;
    private double gdpPerCapita;
    private double CINC;
    public double power;
    public double inclination;
    public boolean isRebel;
    private int vote;
    public int rebelNum;


    /**
     * Constructs a Nation object with a name, GDP, GDP per capita, CINC, and continent.
     *
     * @param name         The name of the nation.
     * @param gdp          The GDP of the nation.
     * @param gdpPerCapita The GDP per capita of the nation.
     * @param CINC         The Composite Index of National Capability (CINC) of the nation.
     * @param continent    The continent of the nation.
     */
    public Nation(String name, double gdp, double gdpPerCapita, double CINC, String continent) {
        this.name = name;
        this.gdp = gdp;
        this.gdpPerCapita = gdpPerCapita;
        this.CINC = CINC;
        this.continent = continent;
        this.rebelNum = 0;
    }

    /**
     * Constructs a Nation object with a name, power, and continent.
     *
     * @param name      The name of the nation.
     * @param power     The power of the nation.
     * @param continent The continent of the nation.
     */
    public Nation(String name, double power, String continent) {
        this.name = name;
        this.power = power;
        this.continent = continent;
        this.isFollower = false;
        this.isRebel = false;
        this.rebelNum = 0;
    }

    /**
     * Sets the abbreviation of the nation based on its name.
     */
    public void setAbbr() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            stringBuilder.append(getName().charAt(i));
        }
        abbr = stringBuilder.toString();
    }

    /**
     * Returns the abbreviation of the nation.
     *
     * @return The abbreviation of the nation.
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * Returns the name of the nation.
     *
     * @return The name of the nation.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Generates a random inclination value for the nation.
     */
    public void generateInclination() {
        Random rand = new Random();
        this.inclination = rand.nextDouble();
    }

    /**
     * Sets the inclination value for the nation.
     *
     * @param Inc The inclination value to be set.
     */
    public void setInclination(double Inc) {
        this.inclination = Inc;
    }

    /**
     * Returns the inclination of the nation for a specific issue.
     *
     * @param issue The issue for which the inclination is requested.
     * @return The inclination of the nation for the given issue.
     */
    public double getInclination(Issue issue) {
        return inclination;
    }

    /**
     * Returns the inclination of the nation.
     *
     * @return The inclination of the nation.
     */
    public double getInclination() {
        return this.inclination;
    }

    /**
     * Checks if the nation is a rebel.
     *
     * @return true if the nation is a rebel, false otherwise.
     */
    public boolean getRebel() {
        return isRebel;
    }

    /**
     * Returns the economic strength of the nation.
     *
     * @return The economic strength of the nation.
     */


    /**
     * Makes a voting decision based on the nation's inclination.
     */
    public void makeVote() {
        double x = getInclination();
        if (x <= 0.45) {
            vote = 0; // No
        } else if (x > 0.45 && x <= 0.55) {
            vote = 1; // Abstain
        } else {
            vote = 2; // Yes
        }
    }

    /**
     * Calculates the power of the nation based on its GDP, GDP per capita, and CINC.
     *
     * @return The power of the nation.
     */
    public double calculatePower() {
        this.power = (((this.gdp * this.gdpPerCapita) / (101.3E12 * 18381)) + this.CINC) / 2;
        return this.power;
    }

    /**
     * Returns the power of the nation.
     *
     * @return The power of the nation.
     */
    public double getPower() {
        return this.power;
    }

    /**
     * Sets the power of the nation.
     *
     * @param number The power value to be set.
     */
    public void setPower(double number) {
        this.power = number;
    }

    /**
     * Returns the CINC of the nation.
     *
     * @return The CINC of the nation.
     */
    public double getCINC() {
        return this.CINC;
    }

    /**
     * Returns the continent of the nation.
     *
     * @return The continent of the nation.
     */
    public String getContinent() {
        return continent;
    }

    /**
     * Returns the voting decision of the nation.
     *
     * @return The voting decision of the nation.
     */
    public int getVote() {
        return this.vote;
    }

    /**
     * Adds payoff to the nation based on its voting decision.
     */
    public void addPayoff() {
        Random rand = new Random();
        double x = 0.05 * rand.nextDouble();
        switch (vote) {
            case 0:
                power -= x * getPower();
                break;
            case 1:
                break;
            case 2:
                power += x * getPower();
                break;
        }
    }
}