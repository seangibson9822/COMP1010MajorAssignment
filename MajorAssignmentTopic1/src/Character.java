import java.util.Random;

public class Character {
    private String name;
    private int hp;
    private int strength;
    private int defense;
    private int speed;

    public Character(String name) {
        this.name = name;
        Random rand = new Random();
        this.hp = rand.nextInt(51) + 50;       // HP between 50–100
        this.strength = rand.nextInt(11) + 10;   // Attack between 10–20
        this.defense = rand.nextInt(6) + 5;    // Defense between 5–10
        this.speed = rand.nextInt(11) + 5;     // Speed between 5–15
    }

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

    public boolean isAlive() {
        return hp > 0;
    }

    public void takeDamage(int damage) {
        int actualDamage = Math.max(0, damage - defense);
        hp -= actualDamage;
        System.out.println(name + " takes " + actualDamage + " damage (HP: " + hp + ")");
    }

    public void attack(Character target) {
        System.out.println(name + " attacks " + target.getName());
        target.takeDamage(this.strength);
    }

    @Override
    public String toString() {
        return name + " (HP: " + hp + ", ATK: " + strength + ", DEF: " + defense + ", SPD: " + speed + ")";
    }
}
