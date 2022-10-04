
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // Ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı"
        
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Matematik Notunuz : ");
        mat = scanner.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = scanner.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = scanner.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce = scanner.nextInt();
        System.out.print("Tarih Notunuz : ");
        tarih = scanner.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik = scanner.nextInt();
        
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ort = toplam/6;
        
        System.out.println("Ortalamanız : " + ort);
        
        String durum = (ort < 60) ? "Sınıfta Kaldı" : "Sınıfı Geçti";
        System.out.println(durum);
        
        /*
        switch ((ort < 60 ) ? 0 : 1) {
            case 0:
                System.out.println("Sınıfta Kaldı");
                break;
            case 1:
                System.out.println("Sınıfı Geçti");
                break;
            default:
                System.out.println("Geçersiz Ortalama");
        }*/
        
    }
    
}
