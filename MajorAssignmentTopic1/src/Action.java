import java.util.Random;

public class Action {

    // Method to handle an attak between two characters
    public static void attack(Character attacker, Character defender) {
        Random rand = new Random();
        int randomBonus = rand.nextInt(6); // Random bonus 0-5

        int attackPower = attacker.getStrength() + randomBonus; // Total attack power
        int damage = attackPower - defender.getDefense();       // Damaged reduced by defender's defence

        if (damage < 0) damage = 0; // damage is aboce 0

        defender.takeDamage(damage); // apply damage

        //print attack details to console
        System.out.println(attacker.getName() + " attacks " + defender.getName() +
                " causing " + damage + " damage!");

        // log attack details to the file
        FileHandler.log(attacker.getName() + " attacks " + defender.getName() + " causing " + damage + " damage!");
    }
}
