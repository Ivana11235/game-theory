
public class Follower extends Nation {
    private Leader leader;

    public boolean hasLeader;


    public Follower(String name, double power, String continent) {
        super(name, power,continent);
        this.leader=null;
        this.hasLeader=false;
        this.isFollower=true;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
        hasLeader=true;
    }
    public Leader getLeader(){
        return this.leader;
    }


}