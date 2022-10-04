
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        int count = input.nextInt();
        int max = 0;
        int min = 0;
        //int[] numbers = new int[count];             // Array 
        
        for (int i = 0; i < count; i++) {
            System.out.print((i+1) + ". Sayı Giriniz : ");
            int new_num = input.nextInt();
            int number = new_num;
            max = Integer.max(new_num, number);
            //System.out.println("max : " + new_num + "-" + max);
            //numbers[i] = input.nextInt();         Array içine ekleme
            
            min = Integer.min(new_num, max);
            //System.out.println("Min : " + new_num + "-" + max);
        }
        
        
        System.out.println("MAX : " + max);
        System.out.println("MIN : " + min);
        
        
        /* Array ile Max, Min Bulmak için
        int max_arr = 0;
        for(int i=0; i<numbers.length; i++ ) {
            if(numbers[i]>max_arr) {
                max_arr = numbers[i];
            }
        }
        int min_arr = numbers[0];
        for(int i=1; i<numbers.length; i++ ) {
            if(numbers[i]<min_arr) {
                min_arr = numbers[i];
            }
        }
        
        System.out.println("---------- ARRAYLIST ile Max, Min ----------");
        System.out.println("MAX : " + max_arr);
        System.out.println("MIN : " + min_arr);
        */
        
    }
}
