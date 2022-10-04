import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Girilen Sayıya Kadar Olan 2'nin Kuvvetlerini Yazdırma
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir Sayı Giriniz : ");
        int numb = input.nextInt();
        
        /*for (int i = 1; i < numb; i*=2) {
            System.out.println(i);
        }*/
        
        
        // Girilen Sayıya Kadar Olan 4 ve 5'in Kuvvetlerini Yazdırma
        for (int i = 1; i < numb; i*=4) {
            if (i==1) {
                for (int j = 1; j < numb; j*=5) {
                    System.out.println("5'e Bölünen : " + j);
                }
            }
            System.out.println("4'e Bölünen : " + i);
        }
        
        
    }
}
