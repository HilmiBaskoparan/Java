import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Kullanıcıdan Negatif Bir Değer Girilene Kadar Değer Alıp Tek Sayıları Toplama
        Scanner input = new Scanner(System.in);
        int total = 0;
        int number;
        /*
        do {            
            System.out.print("Bir Sayı Giriniz : ");
            number = input.nextInt();
            if (number%2 == 1) {
                total += number;
            }
        } while (number > 0);
        
        System.out.println(total);*/
        
        
        // Tek Sayı Girilene Kadar Input Alan ve Girilen Değerlerden Çift ve 4'ün Katları Olan Sayıları Toplama
        int number2, total2 = 0;
        do {            
            System.out.print("Bir Sayı Giriniz : ");
            number2 = input.nextInt();
            if (number2 % 4 == 0) {
                total2 += number2;
            }
        } while (number2 % 2 == 0);
        System.out.println("Toplam : " + total2);
    }
}
