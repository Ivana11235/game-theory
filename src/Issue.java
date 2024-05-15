import java.util.ArrayList;

public class Issue {
    public String name;
    private String location;
    private String date;
    public String type;
    public ArrayList<Integer> incIndicator=new ArrayList<>();
    public ArrayList<Double> limits=new ArrayList<>();
    public ArrayList<Integer> sign=new ArrayList<>();

    public Issue(){

    }

    public Issue(String name, String location, String date) {
        this.name = name;
        this.location = location;
        this.date = date;
    }
    public Issue(String name, String type){
        this.name=name;
        this.type=type;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return this.type;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public void addInclinationIndicator(int index,double limit){
        incIndicator.add(index);
        limits.add(limit);
    }
    public double getLimit(int index){
        return limits.get(index);
    }

    public double calculateInclination(Nation nation){
        return 0;

    }

    public String getDescription(){
        // Return a formatted description of the issue
        return "Name: " + name + "\nLocation: " + location + "\nDate: " + date;
    }
}