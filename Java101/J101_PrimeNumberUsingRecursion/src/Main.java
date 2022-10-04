
import java.util.Scanner;

public class Main {
    
    // PRIME NUMBER WITH FOR LOOP
    public static void primeNumber(int number) {
        if (number == 1 || number == 2) {
            System.out.println( number + " is not prime.");
        }
        
        for (int i = 2; i < number; i++) {
            if (number == 2) {
                break;
            }else if (number % 2 == 0){
                System.out.println(number + " is not prime.");
                break;
            }else {
                System.out.println(number + " is PRIME.");
                break;
            }
        }
    }
    
    // PRIME NUMBER USING RECURSION
    public static boolean primeNumberRecursive(int number, int i) {
        
        if (number <= 2) {
            return (number == 2) ? true : false;
        }
        if (number % i == 0) {
            return false;
        }
        if (number > i) {
            return true;
        }
        return  primeNumberRecursive(number, i+1);
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scan.nextInt();
        
        //primeNumber(number);
        if (primeNumberRecursive(number, 2)) {
            System.out.println( number + " is a PRIME number.");
        }else {
            System.out.println(number + " is not a prime number.");
        }
        
    }
}
