public class Quarry extends BattleLoc{
    private Monster monster;
    
    public Quarry(Player player) {
        super(6, "Coal", player, new Snake(), "Spoils of War", 2);
    }
    
    public static Monster getMonsterS() {
        return new Snake();
    }
    
}
