
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Harmonik Sayılar : 1 + 1/2 + 1/3 + 1/4 + 1/5 ...
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir Sayı Giriniz : ");
        int num = input.nextInt();
        double total = 0;
        
        for (double i = 1; i <= num; i++) {
            total = total + (1/i);
        }
        
        System.out.println(total);
        
    }
}
