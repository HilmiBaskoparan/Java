
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dairenin Yarıçapı : ");
        int r = scanner.nextInt();
        
        double cevre = 2 * pi * r;
        double alan = pi * (r * r);
        
        System.out.println("Dairenin Çevresi : " + cevre);
        System.out.println("Dairenin Alanı   : " + alan);
        
        System.out.print("Dilim için Merkez Açısı Giriniz : ");
        int aci = scanner.nextInt();
        
        double dilim_alan = alan * aci / 360;
        System.out.println(aci + " Derecelik" + " Alan : " + dilim_alan);
    }
    
}
