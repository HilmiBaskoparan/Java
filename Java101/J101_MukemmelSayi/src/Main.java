
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*
            Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı 
            kendisine eşit olan sayıya mükemmel sayı denir.
        */
        
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int perfect = input.nextInt();
        int toplam = 0;
        
        for (int i = 1; i < perfect; i++) {
            if (perfect % (i) == 0) {
                toplam += i;
            }
        }
        System.out.println("Toplam = " + toplam);
        
        if (perfect == toplam) {
            System.out.println(perfect + " mükemmel sayıdır.");
        }else {
            System.out.println(perfect + " mükemmler bir sayı değildir.");
        }
        
    }
}
