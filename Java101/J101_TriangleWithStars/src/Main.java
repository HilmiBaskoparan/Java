
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int star1 = 1;
        
        System.out.println("----------- Right Triangle -----------");
        // Right Triangle with For Loop
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < star1; j++) {
                System.out.print("*");
            }
            System.out.println("");
            star1++;
        }
        
        System.out.println("------- Reverse Right Triangle -------");
        // Reverse Right Triangle with For Loop
        int star2 = num;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < star2; j++) {
                System.out.print("*");
            }
            System.out.println("");
            star2--;
        }
        
        System.out.println("-------------- Triangle --------------");
        // Triangle with For Loop
        int star = 0;
        int space = num-1;
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println("");
            star += 2;
            space--;
        }
        
        System.out.println("--------------- PATIKA ---------------");
        // Example of Patika.dev
        for (int i = 0; i <= num ; i++) {
            for (int j = 0; j < (num - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        System.out.println("-------------- DIAMOND --------------");
        // Diamond with Stars
        for (int i = 0; i <= num ; i++) {
            for (int j = 0; j < (num - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 0; i <= num ; i++) {
            for (int j = 0; j < (num - (num-i-1)); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*(num-i)-1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }  
        
    }
}
