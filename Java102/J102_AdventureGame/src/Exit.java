public class Exit extends NormalLoc{

    public Exit(Player player) {
        super(0, "Log Out", player);
    }

    @Override
    boolean onLocation() {
        System.out.println("Checked Out");
        return true;
    }
    
}
