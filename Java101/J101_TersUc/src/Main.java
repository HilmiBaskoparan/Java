
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // MÜKEMMEL SAYI
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        int total = 0;
        
        for (int i = 1; i < number; i++) {
            if (number%i == 0) {
                total += i;
            }
        }
        
        if (total == number) {
            System.out.println(number + " MÜKEMMEL SAYIDIR.");
        }else {
            System.out.println(number + " mükemmel sayı değildir.");
        }
        
        // TERS ÜÇGEN
        System.out.println("-------------------------------------");
        for (int i = number; i > 0; i--) {
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        // 1-100 Arası ASAL SAYILAR
        System.out.println("-------------------------------------");
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            int control = 0;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    control = 1;
                    break;
                }
            }
            if (control == 0) {
                System.out.print(i+ "  ");
                count++;
            }
        }
        
        
    }
}
