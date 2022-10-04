
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double start = 10;      // Açılış Ücreti
        double perkm = 2.2;     // Amount Per KM
        int km ;                // Gidilecek Mesafe
        
        System.out.print("Gidilecek Yol (KM) : ");
        km = input.nextInt();
        
        double total = km * perkm;
        total += start;
        total = (total < 20) ? 20 : total;
        System.out.println("Ödenecek Tutar : " + total + " TL");
    }
    
}
