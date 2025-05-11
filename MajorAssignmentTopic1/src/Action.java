import java.util.Random;

public class Action {

    public static void attack(Character attacker, Character defender) {
        Random rand = new Random();
        int randomBonus = rand.nextInt(6); // 0-5

        int attackPower = attacker.getStrength() + randomBonus;
        int damage = attackPower - defender.getDefense();

        if (damage < 0) damage = 0;

        defender.takeDamage(damage);

        System.out.println(attacker.getName() + " attacks " + defender.getName() +
                " causing " + damage + " damage!");

        FileHandler.log(attacker.getName() + " attacks " + defender.getName() + " causing " + damage + " damage!");
    }
}
