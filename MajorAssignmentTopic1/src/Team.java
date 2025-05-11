import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Character> members;

    public Team(String teamName) {
        this.teamName = teamName;
        this.members = new ArrayList<>();
    }

    public void addMember(Character c) {
        members.add(c);
    }

    public boolean hasAliveMembers() {
        for (Character c : members) {
            if (c.isAlive()) {
                return true;
            }
        }
        return false;
    }

    //  Returns the first living character
    public Character getFirstAliveMember() {
        for (Character c : members) {
            if (c.isAlive()) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Character> getMembers() {
        return members;
    }

    public String getTeamName() {
        return teamName;
    }
}
