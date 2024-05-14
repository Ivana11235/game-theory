import java.util.ArrayList;
public class Nation {
    String name;

    private String type;
    private int votingOrder;
    private String block;
    private boolean ifVoting;
    private String continent;
    private double gdp;
    private double gdpPerCapita;
    private double CINC;
    public double power;
    public double inclination;
    private boolean outcome;
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
   public Nation (String name, double power){
        this.name=name;
        this.power=power;
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

    public double getInclination() {

        return inclination;
    }

    public boolean getOutcome() {
        return outcome;
    }

    public void makeVote(int vote) {
        this.vote = vote;
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


}