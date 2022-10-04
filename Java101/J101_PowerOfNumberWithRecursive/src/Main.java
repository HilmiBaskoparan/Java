
import java.util.Scanner;

public class Main {
    
    // POWER OF NUMBER (FOR LOOP)
    public static int power(int base, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }
    
    // POWER OF NUMBER USING RECURSIVE
    public static int recursivePower(int base, int power) {
        if (power != 0) {
            return base * recursivePower(base, power-1);
        }else {
            return 1;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number        : ");
        int number = input.nextInt();
        System.out.print("Enter power of number : ");
        int powerValue = input.nextInt();
        
        //System.out.println("Sonuç = " + power(number, powerValue));
        System.out.println("RESULT = " + recursivePower(number, powerValue));
        
    }
}
