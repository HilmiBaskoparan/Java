
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Find EBOB of Two Number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number  : ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = input.nextInt();
        
        int ebob = 0;
        int ekok = 0;
        
        for (int i = 1; i <= num1; i++) {
            if (num1%i == 0 && num2%i ==0) {
                ebob = i;
            }
        }
        System.out.println("EBOB : " + ebob);
        
        // Find EKOK
        int max = num1*num2;
        for (int i = max; i > 0; i--) {
            if (i%num1 == 0 && i%num2 == 0) {
                ekok = i;
            }
        }
        System.out.println("EKOK : " + ekok);
        System.out.println("(n1*n2)/ebob => EKOK = " + (num1*num2)/ebob);   // EKOK = (sayi1 * sayi2)/EBOB
        
        
        // Find EBOB, EKOK with While Loop
        System.out.println("\n------ EBOB, EKOK with While ------");
        int i = 1;
        int w_ebob = 0;
        while (i <= num1) {            
            if (num1%i == 0 && num2%i == 0) {
                w_ebob = i;
            }
            i++;
        }
        System.out.println("EBOB : " + w_ebob);
        
        int w_ekok = 0;
        int j = max;
        while (j > 0) {            
            if (j%num1 == 0 && j%num2 == 0) {
                w_ekok = j;
            }
            j--;
        }
        System.out.println("EKOK : " + w_ekok);
    }
}
