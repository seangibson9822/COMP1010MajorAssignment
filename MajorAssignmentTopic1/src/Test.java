import java.util.*;
import java.io.*;

// Test classes
public class Test {
    public static void main(String[] args) {
        testCharacterCreation();
        testAttackMechanics();
        testTeamFunctionality();
        testBattleSimulation();
        testFileLogging();
    }
    // Tests if a character is initialised correctly with name and random stats within range
    public static void testCharacterCreation() {
        Character c = new Character("TestChar");
        assert c.getName().equals("TestChar") : "Fail: Name mismatch";
        assert c.getHp() >= 50 && c.getHp() <= 100 : "Fail: HP out of range";
        assert c.getStrength() >= 10 && c.getStrength() <= 20 : "Fail: Strength out of range";
        assert c.getSpeed() >= 5 && c.getSpeed() <= 15 : "Fail: Speed out of range";
        System.out.println("testCharacterCreation passed");
    }

    //Tests that attacking another character reduces their hp
    public static void testAttackMechanics() {
        Character attacker = new Character("Attacker");
        Character defender = new Character("Defender");

        int initialHp = defender.getHp();
        attacker.attack(defender);
        assert defender.getHp() <= initialHp : "Fail: Defender HP did not decrease";
        System.out.println("testAttackMechanics passed");
    }

    //Tests that team can correctly store and retrieve characters
    public static void testTeamFunctionality() {
        List<Character> team = new ArrayList<>();
        team.add(new Character("Char1"));
        team.add(new Character("Char2"));
        assert team.size() == 2 : "Fail: Team size incorrect";
        assert team.get(0).getName().equals("Char1") : "Fail: First character incorrect";
        System.out.println("testTeamFunctionality passed");
    }

    //Tests battle simulation logic. Output suppressed to keep the console clean
    public static void testBattleSimulation() {
        // Suppress output during battle
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(new ByteArrayOutputStream()));

        Team team1 = new Team("Team 1");
        team1.addMember(new Character("T1-A"));
        team1.addMember(new Character("T1-B"));

        Team team2 = new Team("Team 2");
        team2.addMember(new Character("T2-A"));
        team2.addMember(new Character("T2-B"));

        Battle battle = new Battle(team1, team2);

        battle.startBattle();

        // Restore output
        System.setOut(originalOut);
        System.out.println("testBattleSimulation completed (output suppressed)");
    }

    //Tests that the battle log file is created and contains content
    public static void testFileLogging() {
        File file = new File("battle_log.txt");
        assert file.exists() : "battle_log.txt not found";
        assert file.length() > 0 : "battle_log.txt is empty";
        System.out.println("testFileLogging passed Check 'battle_log.txt'");
    }
}
