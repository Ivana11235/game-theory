import java.util.ArrayList;

public class Leader extends Nation {
    private int leadershipExperience;

    public Leader(String name, String type, int order, String title, int leadershipExperience) {
        super(name, type, order);

        this.leadershipExperience = leadershipExperience;
    }

    public Leader(String name, double power){
        super(name,power);
    }

    public void makeVote(){
    }
}