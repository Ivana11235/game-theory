import java.util.ArrayList;

public class Issue {
    private String name;
    private String location;
    private String date;
    public ArrayList<Integer> incIndicator=new ArrayList<>();
    public ArrayList<Double> limits=new ArrayList<>();
    public ArrayList<Integer> sign=new ArrayList<>();



    public Issue(String name, String location, String date) {
        this.name = name;
        this.location = location;
        this.date = date;
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
        double total=0;
        for (int i=0;i<incIndicator.size();i++){
            total+=nation.getData(incIndicator.get(i))/getLimit(i);

        }
        return total/incIndicator.size();

    }

    public String getDescription(){
        // Return a formatted description of the issue
        return "Name: " + name + "\nLocation: " + location + "\nDate: " + date;
    }
}