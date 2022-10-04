
import java.util.Random;

public class BattleLoc extends Location{
    private Monster monster;
    private String award;
    private int maxMonster;
    private String selectCombat;
    private boolean selectCombatValue;
    
    public BattleLoc(int id, String name, Player player, Monster monster, String award, int maxMonster) {
        super(id, name, player);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }

    @Override
    boolean onLocation() {
        System.out.println("You are here now " + this.getName());
        System.out.println("Be Careful! Here " + getMaxMonster() + " piece " + this.getMonster().getName() + " lives");
        boolean continueEx = true;
        while (continueEx) {            
            System.out.println("<W>ar or <R>un");
            String selectCase = input.nextLine();
            selectCase = selectCase.toUpperCase();
            if (selectCase.equals("W")) {
                if (combat(getMaxMonster())) {
                    break;
                }else {
                    System.out.println("You are dead!");
                    return false;
                }
            }else if (selectCase.equals("R")) {
                continueEx = false;
            }
        }
        return true;
    }
    
    public boolean combat(int monsNumber) {
        Random random = new Random();
        for (int i = 1; i < monsNumber; i++) {
            this.getMonster().setHealth(this.getMonster().getOrjHealth());
            
            monsterStatus(i);
            playerStatus();
            
            while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {                
                int priotiry = random.nextInt(2);
                System.out.println("<H>it or <R>un");
                String selectCombat = input.nextLine().toUpperCase();
                
                if (selectCombat.equals("H")) {
                    if (priotiry == 0) {
                        System.out.println("You hit it!" + " priotiry: " + priotiry);
                        this.getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit(i);
                    }else {
                        if (this.getMonster().getHealth() > 0) {
                            System.out.println(this.getMonster().getName() + " hit you " + "priotiry: " + priotiry);
                            int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getArmor().getDefence();
                            if (monsterDamage < 0) {
                                monsterDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - this.getMonster().getDamage());
                            afterHit(i);
                        }
                    }
                    this.setSelectCombatValue(true);
                }else if (selectCombat.equals("R")) {
                    afterHit(i);
                    this.setSelectCombatValue(false);
                    return true;
                }
            }
        }
        if (this.getPlayer().getHealth() > this.getMonster().getHealth()) {
            System.out.println("You defeated the enemy");
            if (this.getMonster().getName().equals("Snake")) {
                Player player = this.getPlayer();
                player.awardForQuarry(this.getMonster().getMoneyPrize());
                
                this.setSelectCombatValue(true);
                return true;
            }else {
                int totalGain = this.getMonster().getMoneyPrize() * getMaxMonster();
                System.out.println(totalGain + " You won the gold award");
                System.out.println("Your previous money:" + this.getPlayer().getMoney());
                this.getPlayer().setMoney(this.getPlayer().getMoney() + totalGain);
                System.out.println("Your current money: " + this.getPlayer().getMoney());
                System.out.println(this.getName() + " You have defeated all the enemies in the area!");
                System.out.println("This area has been cleared now.");
                System.out.println("isSelected Value: " + isSelectCombatValue());
                
                this.setSelectCombatValue(true);
                return true;
            }
        }else {
            return false;
        }
    }
    
    private void afterHit(int i) {
        System.out.println("Your health: " + this.getPlayer().getHealth());
        System.out.println(i + ". " + this.getMonster().getName() + " health: " + this.getMonster().getHealth());
        System.out.println("");
    }
    
    private void monsterStatus(int i) {
        System.out.println("**********************************");
        System.out.println(i + ". " + this.getMonster().getName() + "Values: ");
        System.out.println("Health : " + this.getMonster().getHealth());
        System.out.println("Damage : " + this.getMonster().getDamage());
        System.out.println("Prize  : " + this.getMonster().getMoneyPrize());
    }
    
    private void playerStatus() {
        System.out.println("--> Player Values: ");
        System.out.println("Health : " + this.getPlayer().getHealth());
        System.out.println("Damage : " + this.getPlayer().getTotalDamage());
        System.out.println("Money  : " + this.getPlayer().getMoney());
        System.out.println("Weapon : " + this.getPlayer().getWeapon().getName());
        System.out.println("Armor  : " + this.getPlayer().getArmor().getName());
        System.out.println("******************************************");
    }
    
    @Override
    public boolean isSelectCombatValue() {
        return selectCombatValue;
    }
    
    @Override
    public void setSelectCombatValue(boolean selectCombatValue) {
        this.selectCombatValue = selectCombatValue;
    }

    
    
    
    
    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }
    
}
