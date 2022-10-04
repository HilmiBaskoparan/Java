import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Row     : ");
        int row = input.nextInt();
        System.out.print("Enter Column  : ");
        int col = input.nextInt();
        System.out.print("Enter the count of mine : ");
        int mineCount = input.nextInt();
        
        
        MineSweeper game1 = new MineSweeper(row, col, mineCount);
        game1.run();
        
        
    }
}