import java.util.ArrayList;
import java.util.Random;

public class Nation {
    private String name;

    private String type;
    public boolean isFollower;
    private int votingOrder;
    public String abbr;
    private String block;
    private double economicStrength;
    private boolean ifVoting;
    private double GNIperCapita;
    private String continent;
    private double gdp;
    private double gdpPerCapita;
    private double CINC;
    public double power;
    public double inclination;
    private boolean outcome;
    public boolean isRebel;
    private int vote;

    public Nation(String name, String type, int order) {
        this.name = name;
        this.type = type;
        this.votingOrder = order;
    }
    public Nation (String name, double gdp,double gdpPerCapita,double CINC, String continent){
        this.name=name;
        this.gdp=gdp;
        this.gdpPerCapita=gdpPerCapita;
        this.CINC=CINC;
        this.continent=continent;
   }
   public Nation (String name, double power, String continent){
        this.name=name;
        this.power=power;
        this.continent=continent;
        this.isFollower=false;
        this.isRebel=false;
    }
    public void setGNIPerCapita(double GNI){
        this.GNIperCapita=GNI;
    }
    public double getGNIPerCapita(){
        return this.GNIperCapita;
    }
    public void setEconomicStrength(double number){
        economicStrength=number;

    }
    public void setAbbr() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            stringBuilder.append(getName().charAt(i));
        }
        abbr = stringBuilder.toString();
    }
    public String getAbbr(){
        return abbr;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return type;
    }

    public int getOrder() {
        return votingOrder;
    }

    public String getBlock() {
        return block;
    }

    public void generateInclination(){
        Random rand = new Random();
        this.inclination = rand.nextDouble();
    }
    public void setInclination(double Inc){
        this.inclination=Inc;

    }


    public double getInclination(Issue issue) {

        return inclination;
    }
    public double getInclination() {

        return this.inclination;
    }

    public boolean getOutcome() {
        return outcome;
    }

    public double getEconomicStrength(){
        return economicStrength;
    }

    public void makeVote() {


        double x=getInclination();
        if (x<=0.45){
            vote=0;//No
        }
        else if(x>0.45 && x<=0.6){
            vote=1;// Abstain

        }
        else {
            vote=2;//Yes
        }
    }

    public double CalculatePower(){
                this.power=(((this.gdp*this.gdpPerCapita)/(101.3E12*18381))+this.CINC)/2;
                return this.power;

    }
    public double calculateEconomicStrength(){
        economicStrength=gdp*0.6+gdpPerCapita*0.2+GNIperCapita*0.2;
        return economicStrength;
    }

    public double getPower(){
        return this.power;
    }

    public void setPower(double number){
        this.power=number;
    }
    public double getCINC(){
        return this.CINC;
    }
    public String getContinent(){
        return continent;
    }

    public int getVote(){
        return this.vote;
    }
    public void addPayoff(){
        Random rand= new Random();

        double x=0.05 *rand.nextDouble();
        switch (vote){
            case 0:
                power-=x*getPower();
               // System.out.printf("\nPower decreases by %.1f%% ",x*100);
                break;
            case 1:
                //System.out.println("\n Power remains the same");
                break;
            case 2:
                power+=x*getPower();
                //System.out.printf("\nPower increases by %.1f%% ",x*100);
                break;
        }

    }


}