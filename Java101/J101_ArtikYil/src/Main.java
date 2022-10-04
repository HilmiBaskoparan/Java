import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. 
        // Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.
        
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        int date = input.nextInt();
        
        if (date % 4 == 0) {
            if (date % 100 == 0) {
                if (date % 400 == 0) {
                    System.out.println(date + " bir artık yıldır.");
                }else {
                    System.out.println(date + " bir artık yıl değildir.");
                }
            }else {
                System.out.println(date + " bir artık yıldır.");
            }
        }
        else {
            System.out.println(date + " bir artık yıl değildir.");
        }
        
    }
}
