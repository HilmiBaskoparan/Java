
import java.util.Scanner;

public class Main {
    
    /*
        Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. 
        Her çıkarma işlemi sırasında ekrana son değeri yazdırın. 
        Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. 
        Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
    */
    
    public static void desen(int number) {
        
        int count = 0;
        while (number > 0) {
            System.out.print(number + " ");
            number -= 5;
            count++;
        }
        while (count >= 0) {
            System.out.print(number + " ");
            number += 5;
            count--;
        }
        
    }
    
    /*public static int pattern(int number, int count) {
        if (number > 0) {
            System.out.println(number + " " + count);
            count++;
            return pattern(number-5, count);
        }
        if (count > -1) {
            System.out.println(number + " " + count);
            count--;
            return number + pattern(number+5, count);
        }
        return 0;
    }*/
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = scan.nextInt();
        
        //pattern(number, 10);
        desen(number);
        /*System.out.print(pattern(number,0));
        System.out.println("\n*************\n");
        pattern(number,0);*/
        
    }
}
