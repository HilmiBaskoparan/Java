import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // KG Fiyatları
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Armut Kaç Kilo : ");
        int kg_armut = input.nextInt();
        System.out.print("Elma Kaç Kilo : ");
        int kg_elma = input.nextInt();
        System.out.print("Domates Kaç Kilo : ");
        int kg_domates = input.nextInt();
        System.out.print("Muz Kaç Kilo : ");
        int kg_muz = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo : ");
        int kg_patlican = input.nextInt();
        
        double toplam = (kg_armut*armut) + (kg_elma*elma) + (kg_domates*domates) + 
                        (kg_muz*muz) + (kg_patlican*patlican);
        
        System.out.println("Toplam Tutar : " + toplam);
        
    }
}