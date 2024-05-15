import java.util.ArrayList;

public class Follower extends Nation {
    private Leader leader;

    public boolean hasLeader;

    public Follower(String name, String type, int order, String title) {
        super(name, type, order);
        this.leader = null;
    }

    public void rebel() {
        // Add rebel logic here
    }

    public Follower(String name, double power, String continent) {
        super(name, power,continent);
        this.leader=null;
        this.hasLeader=false;
    }

    public void makeVote() {
        // Add makeVote logic here
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
        hasLeader=true;
    }
    public Leader getLeader(){
        return this.leader;
    }
    public boolean hasItsLeader(){
        return hasLeader;
    }


}