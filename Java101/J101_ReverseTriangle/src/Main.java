
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Reverse Triangle with Stars
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Digit Value : ");
        int number = scanner.nextInt();
        
        for (int i = number; i > 0; i--) {
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
    }
}
