public class Monster {
    private int id;
    private String name;
    private int damage, health, moneyPrize;
    private int orjHealth;    

    public Monster(int id, String name, int damage, int health, int moneyPrize) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.moneyPrize = moneyPrize;
        this.orjHealth = health;    // First Health
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public int getMoneyPrize() {
        return moneyPrize;
    }

    public void setMoneyPrize(int moneyPrize) {
        this.moneyPrize = moneyPrize;
    }

    public int getOrjHealth() {
        return orjHealth;
    }

    public void setOrjHealth(int orjHealth) {
        this.orjHealth = orjHealth;
    }
    
    
    
    
}
