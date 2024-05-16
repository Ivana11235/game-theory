import java.util.ArrayList;
import java.util.Random;

public class Nation {
    private String name;

    private String type;
    public boolean isFollower;
    private int votingOrder;
    public String abbr;
    private String block;
    private boolean ifVoting;
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


}