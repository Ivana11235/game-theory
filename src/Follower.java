import java.util.ArrayList;

public class Follower extends Nation {
    private int leadershipExperience;

    public Follower(String name, String type, int order, String title) {
        super(name, type, order);

        this.leadershipExperience = leadershipExperience;
    }
    public void rebel(){}

    public Follower(String name, double power){
        super(name,power);
    }

    public void makeVote(){
    }

    public void setLeader(Leader leader){

    }

}