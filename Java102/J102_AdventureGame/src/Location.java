import java.util.Scanner;

public abstract class Location {
    private int id;
    private String name;
    private Player player; 
    private boolean selectCombatValue = false;
    protected Scanner input = new Scanner(System.in);

    public Location(int id, String name, Player player) {
        this.id = id;
        this.name = name;
        this.player = player;
    }
    
    abstract boolean onLocation();
    
    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public boolean isSelectCombatValue() {
        return selectCombatValue;
    }

    public void setSelectCombatValue(boolean selectCombatValue) {
        this.selectCombatValue = selectCombatValue;
    }
    
    
    
}
