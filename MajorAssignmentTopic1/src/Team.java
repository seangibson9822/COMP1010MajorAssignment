import java.util.ArrayList;

public class Team {
    private String teamName;                    //Team name
    private ArrayList<Character> members;       // List of characters in the team

    // Constructor to create a team with a given name
    public Team(String teamName) {
        this.teamName = teamName;
        this.members = new ArrayList<>();
    }
    // Add character to team
    public void addMember(Character c) {
        members.add(c);
    }
    // Check if team has alive members
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

    // Get all members of the team
    public ArrayList<Character> getMembers() {
        return members;
    }

    // Get teams name
    public String getTeamName() {
        return teamName;
    }
}
