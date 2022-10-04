import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int mat, fizik, turkce, kimya, muzik;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz     : ");
        fizik = input.nextInt();
        System.out.print("Türkçe Notunuz    : ");
        turkce = input.nextInt();
        System.out.print("Kimya Notunuz     : ");
        kimya = input.nextInt();
        System.out.print("Müzik Notunuz     : ");
        muzik = input.nextInt();
        
        int total = mat + fizik + turkce + kimya + muzik;
        double avg = total/5;
        
        if (avg >= 0 && avg <= 100) {
            if (avg >= 55) {
                System.out.println("Tebrikler Sınıfı Geçtiniz...");
                System.out.println("Ortalamanız : " + avg);
            }else {
                System.out.println("Malesef Sınıfta Kaldınız...");
                System.out.println("Ortalamanız : " + avg);
            }
        }else {
            System.out.println("Geçersiz Ortalama !!!");
        }
    }
}
