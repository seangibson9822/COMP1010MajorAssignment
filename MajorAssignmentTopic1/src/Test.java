

public class Test {
    public static void main(String[] args) {
        testCharacterCreation();
        testAttackMechanics();
        testTeamFunctionality();
        testBattleSimulation();
        testFileLogging();
    }

    static void testCharacterCreation() {
        Character c = new Character("Tester");
        assert c.getHp() >= 50 && c.getHp() <= 100 : "HP out of range";
        assert c.getStrength() >= 10 && c.getStrength() <= 20 : "Attack out of range";
        assert c.getDefense() >= 5 && c.getDefense() <= 10 : "Defense out of range";
        assert c.getSpeed() >= 5 && c.getSpeed() <= 15 : "Speed out of range";
        System.out.println("✅ testCharacterCreation passed");
    }

    static void testAttackMechanics() {
        Character attacker = new Character("Attacker");
        Character defender = new Character("Defender");

        int initialHP = defender.getHp();
        Action.attack(attacker, defender);
        assert defender.getHp() <= initialHP : "Defender did not take damage";
        assert defender.getHp() >= 0 : "Defender HP went negative";
        System.out.println("✅ testAttackMechanics passed");
    }

    static void testTeamFunctionality() {
        Team team = new Team("Testers");
        Character c1 = new Character("AliveGuy");
        team.addMember(c1);

        assert team.hasAliveMembers() : "Team should have alive member";
        c1.takeDamage(999);  // Kill the character
        assert !team.hasAliveMembers() : "Team should have no alive members";
        System.out.println("✅ testTeamFunctionality passed");
    }

    static void testBattleSimulation() {
       Team team1 = new Team("Team 1");
team1.addMember(new Character("T1-A"));
team1.addMember(new Character("T1-B"));

        Team team2 = new Team("Team 2");
        team2.addMember(new Character("T2-A"));
        team2.addMember(new Character("T2-B"));

        Battle battle = new Battle(team1, team2);

        battle.startBattle();  // This will write to log as well
        System.out.println("✅ testBattleSimulation completed (check console/log)");
    }

    static void testFileLogging() {
        FileHandler.log("This is a test log line.");
        System.out.println("✅ testFileLogging passed – Check 'battle_log.txt'");
    }
}
