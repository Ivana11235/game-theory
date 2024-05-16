import java.util.ArrayList;

public class Follower extends Nation {
    private Leader leader;

    public boolean hasLeader;

    private boolean ifRebel;

    public Follower(String name, String type, int order, String title) {
        super(name, type, order);
        this.leader = null;
    }

    public void rebelAgainstLeader() {
        ifRebel=true;
    }

    public Follower(String name, double power, String continent) {
        super(name, power,continent);
        this.leader=null;
        this.hasLeader=false;
        this.ifRebel=false;
        this.isFollower=true;
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