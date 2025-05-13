

public class Main {
    public static void main(String[] args) {
        Team team1 = createTeam("Team1", "Team1-");
        Team team2 = createTeam("Team2", "Team2-");

        //Start a new battle between teams
        Battle battle = new Battle(team1, team2);
        battle.startBattle();
    }
    // Helper method to create a team with characters
    private static Team createTeam(String teamName, String prefix) {
        Team team = new Team(teamName);
        for (int i = 1; i <= 3; i++) {
            team.addMember(new Character(prefix + "Char" + i));
        }
        return team;
    }
}
