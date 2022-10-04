
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Kullanıcının Girdiği Değerler İle Üslü Sayı Hesaplayan Program
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir Sayı Giriniz  : ");
        int num = input.nextInt();
        System.out.print("Kuvvetini Giriniz : ");
        int kuv = input.nextInt();
        int total = 1;
        
        for (int i = 0; i < kuv; i++) {
            total *= num;
        }
        System.out.println(total);
        
        
        // While Döngüsüyle 
        /*int a = 0;
        while (a < kuv) {            
            total *= num;
            a++;
        }
        System.out.println(total);*/
        
        
    }
}
