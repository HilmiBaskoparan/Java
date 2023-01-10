
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Program is started.");
        Scanner input = new Scanner(System.in);
        
        int a = 10;
        int b = 0;
        int c;
        try {
            System.out.println("Division Operation");
            System.out.println(a/b);
            System.out.println("Division is completed.");
            c = input.nextInt();
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } catch (InputMismatchException i){
            System.out.println(i.getMessage());
        } finally {
            System.out.println("This code is always run.");
        }
        
        
        System.out.println("Program is over.");
    }
}
