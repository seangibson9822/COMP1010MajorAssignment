import java.util.Random;

public class Character {
    private String name;
    private int hp;
    private int strength;
    private int defense;
    private int speed;

    // Constructor to initialise character stats
    public Character(String name) {
        this.name = name;
        Random rand = new Random();
        this.hp = rand.nextInt(51) + 50;       // HP between 50–100
        this.strength = rand.nextInt(11) + 10;   // Attack between 10–20
        this.defense = rand.nextInt(6) + 5;    // Defense between 5–10
        this.speed = rand.nextInt(11) + 5;     // Speed between 5–15
    }

    // getters
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }
    
    // check if character is alive
    public boolean isAlive() {
        return hp > 0;
    }

    //Apply damage to characters HP, considering defense
    public void takeDamage(int damage) {
        int actualDamage = Math.max(0, damage - defense);
        hp -= actualDamage;
        System.out.println(name + " takes " + actualDamage + " damage (HP: " + hp + ")");
    }

    // Attack another character, cause damage based on strength
    public void attack(Character target) {
        System.out.println(name + " attacks " + target.getName());
        target.takeDamage(this.strength);
    }

    //Display character stats
    @Override
    public String toString() {
        return name + " (HP: " + hp + ", ATK: " + strength + ", DEF: " + defense + ", SPD: " + speed + ")";
    }
}
