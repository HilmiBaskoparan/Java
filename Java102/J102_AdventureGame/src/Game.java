
import java.util.Scanner;

public class Game {
    private Player player;
    private Location location;
    
    private Scanner input = new Scanner(System.in);
    
    public void start() {
        System.out.println("WELCOME TO GAME");
        System.out.print("Please enter an user name : ");
        String playerName = input.nextLine();
        Player gamer = new Player(playerName);
        System.out.println("Dear " + gamer.getName() + "!\nAre you ready for the mysterious adventure game");
        System.out.println("Welcome to HELL :)");
        
        gamer.showHeroList();
        gamer.selectHero();
        
        gamer.showRegion();
        
        
        
        
    }
    
    
    
    
    
}
