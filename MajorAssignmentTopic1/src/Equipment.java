public class Equipment {
    private String name;        //equiptment name
    private int attackBoost;    //boost attack strength
    private int defenseBoost;   //boost defence

    //Equipment constructor
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
