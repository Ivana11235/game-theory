
public class Issue {
    public String name;
    public String type;

    public Issue(){

    }

    public Issue(String name, String type){
        this.name=name;
        this.type=type;
    }



    public String getName() {
        return name;
    }
    public String getType(){
        return this.type;
    }
}