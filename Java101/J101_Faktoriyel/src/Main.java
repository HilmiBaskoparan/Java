import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        /* Faktoriyel Hesabı
        System.out.print("Faktoriyel hesabı için bir sayı giriniz :");
        int num = input.nextInt();
        int fakt = 1;
        
        for (int i = num; i > 0; i--) {
            fakt *= i;
        }
        System.out.println(fakt);*/
        
        // KOMBİNASYON =>  C(n,r) = n! / (r! * (n-r)!)
        System.out.print("Kombinasyon için 2 değer giriniz C(n,r) : ");
        int n = input.nextInt();
        int r = input.nextInt();
        int total_n = 1, total_r = 1, total_x = 1;
        
        for (int i = n; i > 0; i--) {
            total_n *= i;
        }
        
        for (int i = r; i > 0; i--) {
            total_r *= i;
        }
        
        for (int i = n-r; i > 0; i--) {
            total_x *= i;
        }
        
        // FORMÜL
        double sonuc = total_n / (total_r * total_x);
        System.out.println("Kombinasyon Sonucu C("+n+","+ r + ") = " + sonuc);
    }
}
