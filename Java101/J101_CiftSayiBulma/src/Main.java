
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        
        // Girilen Sayıya Kadar Çift Sayıları Yazdırma
        System.out.println("Çift Sayılar");
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
        // Girilen Sayıya Kadar 3'e ve 4'e Tam Bölünebilen Sayıların Ortalamasını Hesaplama
        System.out.print("Bir Sayı Giriniz : ");
        int number2 = input.nextInt();
        int count = 0, toplam = 0;
        for (int i = 1; i < number2; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                System.out.print(i + " " );
                toplam += i;
                count +=1;
            }
        }
        System.out.println("\nOrtalama : " + (toplam/count));
        
    }
}
