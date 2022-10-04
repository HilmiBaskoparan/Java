public class Store extends NormalLoc{
    
    public Store(Player player) {
        super(2, "Store", player);
    }

    @Override
    boolean onLocation() {
        System.out.println("********** Welcome to the STORE **********");
        boolean showMenu = true;
        while (showMenu) {            
            System.out.println("1 - Weapons");
            System.out.println("2 - Armors");
            System.out.println("0 - Quit");
            System.out.println("");
            System.out.print("Please select a category to buy: ");
            int selection = input.nextInt();
            while (selection < 0 || selection > 2 ) {                
                System.out.print("You entered an invalid value. Re-enter value ");
                selection = input.nextInt();
            }
            switch(selection) {
                case 0:
                    System.out.println("See you again as soon as possible");
                    showMenu = false;
                    break;
                case 1:
                    printWeapon();
                    buyWeapon();
                    showMenu = false;
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    showMenu = false;
                    break;
                default:
                    System.out.println("Weapon selected");
                    printWeapon();
                    showMenu = false;
                    break;
            }
        }
        return true;
    }
    
    public void printWeapon() {
        for (Weapon w : Weapon.weapons()) {
            System.out.println("ID: " + w.getId() + "\tWeapon: " + w.getName() + 
                    "\tDamage: " + w.getDamage() + "\tPrice: " +w.getPrice());
        }
        Weapon.weapons();
        System.out.println("0 - Log Out");
    }
    
    public void buyWeapon() {
        System.out.println("Select a weapon: ");
        int selectionWeapon = input.nextInt();
        while (selectionWeapon < 0 || selectionWeapon > Weapon.weapons().length) {            
            System.out.println("Invalid Value. Re-enter: ");
            selectionWeapon = input.nextInt();
        }
        if (selectionWeapon != 0) {
            Weapon selectionWeaponId = Weapon.getWeaponId(selectionWeapon);
            if (selectionWeaponId != null) {
                if (selectionWeaponId.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("You don't have enough money");
                }else {
                    System.out.println(selectionWeaponId.getName() + " you bought");
                    int balance = this.getPlayer().getMoney() - selectionWeaponId.getPrice();
                    System.out.println("Your remaining money: " + balance);
                    System.out.println("Your previous weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectionWeaponId);
                    System.out.println("Your new weapon: " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().setMoney(balance);
                }
            }
        }
        
    }
    
    public void printArmor() {
        for (Armor a : Armor.armors()) {
            System.out.println("ID: " + a.getId() + "\tArmor: " + a.getName() + 
                    "\tDefence: " + a.getDefence() + "\tPrice: " + a.getPrice());
        }
        System.out.println("0 - Log Out\n");
    }
    
    public void buyArmor() {
        System.out.print("Select an armor: ");
        int selectionArmor = input.nextInt();
        while (selectionArmor < 0 || selectionArmor > Armor.armors().length) {            
            System.out.println("Invalid Value. Select again : ");
            selectionArmor = input.nextInt();
        }
        
        Armor selectedArmor = Armor.getArmorId(selectionArmor);
        
        if (selectedArmor != null) {
            if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("You don't have enough money");
            }else {
                System.out.println(selectedArmor.getName() + " you bought");
                int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                System.out.println("Your remaining money: " + balance);
                this.getPlayer().setMoney(balance);
            }
        }
    }
    
    
    
}
