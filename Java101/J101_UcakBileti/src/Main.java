import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int distance, age, trip_type;
        double tutar, perKm = 0.1;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş) : ");
        trip_type = input.nextInt();
        tutar = distance * perKm;
        
        if (distance >= 0 && age >= 0 && (trip_type == 1 || trip_type ==2)) {
            // Yaşa Göre İndirim
            if (age < 12) {
                tutar -= tutar * 0.5; 
            }else if (age <= 24) {
                tutar -= tutar * 0.1;
            }else if (age >= 65) {
                tutar -= tutar * 0.3;
            }
            
            // Yolculuk Tipine Göre İndirim
            if (trip_type == 2) {
                tutar -= tutar * 0.2;
                tutar *= 2; 
            }
            System.out.println("Toplam Tutar " + tutar);
        }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
        
    }
}
