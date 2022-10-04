public class Armor {
    private int id;
    private String name;
    private int defence;
    private int price;

    public Armor(int id, String name, int defence, int price) {
        this.id = id;
        this.name = name;
        this.defence = defence;
        this.price = price;
    }
    
    public static Armor[] armors() {
        Armor[] armorList = {new Armor(1, "Light", 1, 15),
                            new Armor(2, "Middle", 3, 25),
                            new Armor(3, "Heavy", 5, 40)};
        return armorList;
    }
    
    public static Armor getArmorId(int id) {
        for (Armor armor : Armor.armors()) {
            if (armor.getId() == id) {
                return armor;
            }
        }
        return null;
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

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
}
