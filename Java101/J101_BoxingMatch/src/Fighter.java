public class Fighter {
    String name;
    int damage, health, weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }
    
    public int hit(Fighter rival) {
        
        System.out.println(this.name + " hit " + rival.name + " with " + this.damage + " damage.");
        
        if (rival.dodge()) {
            System.out.println(rival.name + " dodged " + this.damage + " damage from " + this.name);
            return rival.health;
        }
        if (rival.health - this.damage < 0) {
            return 0;
        }
        return rival.health-this.damage;
    }
    
    public boolean dodge() {
        double randVal = Math.random()*100;
        //System.out.println("Random değeri : " + randVal);
        return randVal < this.dodge;
    }
    
}