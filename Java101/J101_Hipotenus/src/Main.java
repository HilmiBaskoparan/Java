
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // h^2 = a^2 + b^2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("1. Dik Kenar Uzunluğu : ");
        int a = input.nextInt();
        System.out.print("2. Dik Kenar Uzunluğu : ");
        int b = input.nextInt();
        
        double h = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs Değeri : " + h);
        
        double cevre = a+b+h;
        double alan = a*b/2;
        System.out.println("Üçgenin Çevresi  : " + cevre);
        System.out.println("Üçgenin Alanı    : " + alan);
    }
    
}
