public class Battle {
    private Team team1;
    private Team team2;

    //constructor for battle
    public Battle(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    //Start battle and run until one team is defeated
    public void startBattle() {
        System.out.println("Battle begins between " + team1.getTeamName() + " and " + team2.getTeamName() + "!");
        battleRound(); // Start the recursive combat loop

        System.out.println("Battle is over!");
        if (team1.hasAliveMembers()) {
            System.out.println(team1.getTeamName() + " wins!");
        } else if (team2.hasAliveMembers()) {
            System.out.println(team2.getTeamName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    // Recursive method for battle rounds
    private void battleRound() {
        if (!team1.hasAliveMembers() || !team2.hasAliveMembers()) {
            return; // Base case: end recursion when one team is defeated
        }

        Character attacker = team1.getFirstAliveMember();
        Character defender = team2.getFirstAliveMember();

        Action.attack(attacker, defender);

        // Counterattack if defender's team still has living members
        if (team2.hasAliveMembers()) {
            Character counterAttacker = team2.getFirstAliveMember();
            Character counterDefender = team1.getFirstAliveMember();
            Action.attack(counterAttacker, counterDefender);
        }

        // Recursive call: continue to next round
        battleRound();
    }
}
