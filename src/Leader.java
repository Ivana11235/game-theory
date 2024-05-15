import java.util.ArrayList;

public class Leader extends Nation {

    public Leader(String name, String type, int order) {
        super(name, type, order);

    }

    public Leader(String name, double power,String continent){
        super(name,power,continent);
    }

    public void makeVote(){
    }
}