public class SafeHouse extends NormalLoc{
    
    public SafeHouse(Player player) {
        super(1, "Safe House", player);
    }

    @Override
    boolean onLocation() {
        System.out.println("********** Welcome to the Safe House **********");
        System.out.println("Your health is renewed");
        this.getPlayer().setHealth(this.getPlayer().getOrjHealth());
        return true;
    }
    
}
