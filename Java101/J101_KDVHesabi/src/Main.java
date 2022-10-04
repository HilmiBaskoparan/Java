
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        double tutar, kdvOran = 0, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tutar giriniz : ");
        tutar = input.nextDouble();
        
        /* Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , 
           tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız. */
        if (tutar >= 0 && tutar <= 1000) {
            kdvOran = 0.18;
        }else if(tutar > 1000) {
            kdvOran = 0.08;
        }else {
            System.out.println("Pozitif Bir Değer Giriniz...");
        }
        
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        
        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı     : %" + kdvOran * 100);
        System.out.println("KDV Tutarı    : " + kdvTutar);
        System.out.println("KDV'li Tutar  : " + kdvliTutar);
    } 
}
