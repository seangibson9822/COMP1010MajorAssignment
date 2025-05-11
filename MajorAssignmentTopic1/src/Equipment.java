public class Equipment {
    private String name;
    private int attackBoost;
    private int defenseBoost;

    public Equipment(String name, int attackBoost, int defenseBoost) {
        this.name = name;
        this.attackBoost = attackBoost;
        this.defenseBoost = defenseBoost;
    }
    
    // Getters
    public int getAttackBoost() {
        return attackBoost;
    }

    public int getDefenseBoost() {
        return defenseBoost;
    }

    public String getName() {
        return name;
    }
}
