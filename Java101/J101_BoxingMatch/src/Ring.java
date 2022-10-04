public class Ring {
    
    Fighter f1,f2;
    int minWeight, maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    
    public void run() {
        
        if (isChecked()) {
            if (whoStarts()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("-------------------------------------");
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    showHealth();
                }
                System.out.println(f1.name + " Health : " + this.f1.health);
                System.out.println(f2.name + "Health : " + this.f2.health);
            }else {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("-------------------------------------");
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    showHealth();
                }
                System.out.println(f1.name + " Health : " + this.f1.health);
                System.out.println(f2.name + "Health : " + this.f2.health);
            }
            
        }else {
            System.out.println("Weights are don't match !!!");
        }
    }
    
    public boolean isWin() {
        if (f1.health <= 0) {
            System.out.println("Winner : " + f2.name);
            return true;
        }else if (f2.health <= 0) {
            System.out.println("Winner : " + f1.name);
            return true;
        }
        return false;
    }
    
    public boolean isChecked() {
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }
    
    public void showHealth() {
        System.out.println(f1.name + " Remaining Health : " + f1.health );
        System.out.println(f2.name + " Remaining Health : " + f2.health );
    }
    
    public boolean whoStarts() {
        double randomWho = Math.random()*100;
        return randomWho > 50;
    }
}
