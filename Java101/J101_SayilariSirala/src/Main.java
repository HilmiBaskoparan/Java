import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Girilen 3 sayıyı sıralama
        int x, y, z;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Sıralamak için 3 sayı giriniz");
        System.out.print("1. Sayı : ");
        x = input.nextInt();
        System.out.print("2. Sayı : ");
        y = input.nextInt();
        System.out.print("3. Sayı : ");
        z = input.nextInt();
        
        if (x > y && x > z) {
            System.out.println(x);
            if (y > z) {
                System.out.println(y + "\n" + z);
            }else {
                System.out.println(z + "\n" + y);
            }
        }else if (y > x && y > z) {
            System.out.println(y);
            if (x > z) {
                System.out.println(x + "\n" + z);
            }else {
                System.out.println(z + "\n" + x);
            }
        }else if (z > x && z > y) {
            System.out.println(z);
            if (x > y) {
                System.out.println(x + "\n" + y);
            }else {
                System.out.println(y + "\n" + x);
            }
        }
        
        
    }
}
