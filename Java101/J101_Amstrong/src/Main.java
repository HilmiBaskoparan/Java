import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir Sayı Giriniz : ");
        int num = input.nextInt();
        int basamak_num = 0;
        int new_num = num;
        int basamak_val;
        int result = 0;
        int basPow;
        
        while (new_num != 0) {
            new_num /= 10;
            basamak_num++;
        }
        System.out.println("Basamak Sayısı : " + basamak_num);
        
        new_num = num;
        while (new_num != 0) {            
            basamak_val = new_num % 10;
            basPow = 1;
            for (int i = 0; i < basamak_num; i++) {
                basPow *= basamak_val;
            }
            result += basPow;
            new_num /= 10;
        }
        
        if (result == num) {
            System.out.println(num + " bir Armstrong Sayısıdır.");
        }else {
            System.out.println(num + " bir Armstrong DEĞİLDİR.");
        }
        
        // Bir Sayının Basamak Değerlerini Toplayan
        int total = 0, count = 0;
        while(num != 0)
        {
           total=(num%10)+total;
           num /= 10;
            ++count;
        }
        System.out.println("Basamak Değerleri Toplamı : " + total);
        
    }
}
