
import java.util.Random;
import java.util.Scanner;

public class Player {
    private int id;
    private String name;
    private int damage, health, money;
    private String charName;
    private Inventory inventory;
    private Location location = null;
    private int orjHealth;
    
    private Scanner input = new Scanner(System.in);
    
    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }
    
    // Show Heroes 
    public void showHeroList() {
        System.out.println("--------------------------------------------------------------------");
        Heroes[] heroList = {new Samurai(), new Archer(), new Knight()};
        for (Heroes hero : heroList) {
            System.out.println("Character: " + hero.getName() + 
                               "\tDamage : " + hero.getDamage() + 
                               "\tHealth : " + hero.getHealth() +
                               "\tMoney : " + hero.getMoney());
        }
        System.out.println("--------------------------------------------------------------------");
    }
    
    // Select a Hero
    public void selectHero() {
        boolean cs = true;
        while (cs) {
            cs = false;
            System.out.print("Please select a character: ");
            charName = input.nextLine(); 
            if (charName.equals("Samurai")) {
                initPlayer(new Samurai());
            }else if (charName.equals("Archer")) {
                initPlayer(new Archer());
            }else if (charName.equals("Knight")) {
                initPlayer(new Knight());
            }else {
                System.out.println("Wrong Hero Selections");
                cs = true;
            }
        }
        
        
        
    }
    
    // Get hero's informations
    public void initPlayer(Heroes hero) {
        this.charName = hero.getName();
        this.damage = hero.getDamage();
        this.setHealth(hero.getHealth());
        this.orjHealth = hero.getHealth();
        this.setMoney(hero.getMoney());
        
        System.out.println("Hero    : " + this.charName + "\tDamage  : " + this.damage + 
                           "\tHealth  : " + this.health + "\tMoney   : " + this.money);
    }
    
    // Show Regions
    public void showRegion() {
        while (true) {            
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Now choose a region to go");
            Location[] locations = {new SafeHouse(this), new Store(this), new Cave(this), new Jungle(this),
                                    new River(this), new Quarry(this), new Exit(this)};
            for (Location loc : locations) {
                System.out.println(loc.getId() + " - " + loc.getName());
            }
            System.out.print("Select region : ");
            int chooseRegion = input.nextInt();
            switch(chooseRegion){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(this);
                    break;
                case 2:
                    location = new Store(this);
                    break;
                case 3:
                    location = new Cave(this);
                    break;
                case 4:
                    location = new Jungle(this);
                    break;
                case 5:
                    location = new River(this);
                    break;
                case 6:
                    location = new Quarry(this);
                    break;
                default:
                    System.out.println("Not valid region! Going to the safe zone!");
                    location = new SafeHouse(this);
                    break;
            }
            if (location == null) {
                System.out.println("Exiting the game...");
                break;
            }else if (!location.onLocation()) {
                System.out.println("GAME OVER");
                break;
            }
        }
        
        
    }
    
    
    public void isDelete(int choose) {
        if (location.isSelectCombatValue()) {
            System.out.println("All creatures in this area are dead, please choose another area!");
        }
    }
    
    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }
    
    public Weapon getWeapon() {
        return this.getInventory().getWeapon();
    }

    public Armor getArmor() {
        return this.getInventory().getArmor();
    }
    
    // For Quary
    public void awardForQuarry(int possible) {
        Weapon[] weapons = {
            Weapon.getWeaponId(3),
            Weapon.getWeaponId(3),
            Weapon.getWeaponId(2),
            Weapon.getWeaponId(2),
            Weapon.getWeaponId(2),
            Weapon.getWeaponId(1),
            Weapon.getWeaponId(1),
            Weapon.getWeaponId(1),
            Weapon.getWeaponId(1),
            Weapon.getWeaponId(1)
        };
        Armor[] armors = {
                Armor.getArmorId(3),
                Armor.getArmorId(3),
                Armor.getArmorId(2),
                Armor.getArmorId(2),
                Armor.getArmorId(2),
                Armor.getArmorId(1),
                Armor.getArmorId(1),
                Armor.getArmorId(1),
                Armor.getArmorId(1),
                Armor.getArmorId(1)
        };
        int money[] = { 1, 1, 1, 1, 1, 5, 5, 5, 10, 10 };
        
        Random random = new Random();
        int possRn = possible;
        int percent;
        if (possRn < 3) {
            percent = random.nextInt(10);
            Weapon weapon = weapons[percent];
            System.out.println("Congratulations! You have won a weapon.");
            System.out.println("Your previous weapon: " + this.getWeapon().getName());
            this.getInventory().setWeapon(weapon);
            System.out.println("Your new weapon: " + this.getWeapon().getName());

        } else if (2 < possRn || possRn < 6) {
            percent = random.nextInt(10);
            Armor armor = armors[percent];
            System.out.println("Congratulations! You have gained armor.");
            System.out.println("Your previous weapon:" + this.getArmor().getName());
            this.getInventory().setArmor(armor);
            System.out.println("Your new weapon: " + this.getArmor().getName());
        } else if (5 < possRn || possRn < 11) {
            percent = random.nextInt(10);
            int gain = money[percent];
            System.out.println("Congratulations! You won gold.");
            System.out.println("Your previous money:" + this.getMoney() + " gold");
            this.setMoney(this.getMoney() + gain);
            System.out.println("Your new money: " + getMoney() + " gold");
        } else {
            System.out.println("Unfortunately you didn't win anything!");
        }
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
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getOrjHealth() {
        return orjHealth;
    }

    public void setOrjHealth(int orjHealth) {
        this.orjHealth = orjHealth;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
    
    
}
