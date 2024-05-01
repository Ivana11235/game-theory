import java.util.ArrayList;


public class Nation {
    private String name;
    public String abbr;
    private String type;
    private int votingOrder;
    private String block;
    private boolean ifVoting;
    private String[] powerIndicators;
    private double gdp;
    private double gdpPerCapita;
    private double CINC;
    private double power;
    private double inclination;
    private boolean outcome;
    private int vote;
    ArrayList<Double>data=new ArrayList<>();
    ArrayList<String>dataTypes=new ArrayList<>();

    public Nation(String name, String type, int order) {
        this.name = name;
        this.type = type;
        this.votingOrder = order;
    }
    public Nation (String name, double gdp,double gdpPerCapita,double CINC){
        this.name=name;
        this.gdp=gdp;
        this.gdpPerCapita=gdpPerCapita;
        this.CINC=CINC;
   }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public double getGDP(){
        return this.gdp;
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
    public void addData(String dataType, double info, int index){
        if (index<=data.size()){
            data.set(index,info);
            dataTypes.set(index,dataType);

        }
        else{
            data.add(info);
            dataTypes.add(dataType);
        }
    }
    public double getPower(){
        return (((this.gdp*this.gdpPerCapita)/(101.3E12*18381))+this.CINC)/2;

    }

    public double calcualtePower(double GDP, double GDPPerCapita, double CINC){
        this.power=(((GDP*GDPPerCapita)/(101.3E12*18381))+CINC)/2;
        return this.power;
    }


    public double getData(int index){
        return data.get(index);
    }
}
