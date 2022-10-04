
import java.util.Scanner;

public class Main {
    
    // Fibonacci with For Loop
    public static void fibonacci(int number){
        int a = 0, b = 1, x = 0;
        
        System.out.print(a + " " + b);
        
        for (int i = 2; i < number; i++) {
            x = a+b;
            System.out.print(" " + x);
            a=b;
            b=x;
        }
        System.out.println("");
    }
    
    // Fibonacci with Recursion
    public static int recursiveFibonacci(int n) {
        if(n == 0){
            return 0;
        }
	if(n == 1 || n == 2){
            return 1;
        }
        return recursiveFibonacci(n-2) + recursiveFibonacci(n-1);
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        
        System.out.println("Fibonacci with For Loop");
        fibonacci(num);
        
        System.out.println("Fibonacci Using Recursion");
        for(int i = 0; i < num; i++){
            System.out.print(recursiveFibonacci(i) +" ");
        }
        
    }
}
