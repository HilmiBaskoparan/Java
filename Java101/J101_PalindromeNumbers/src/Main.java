
import java.util.Scanner;

public class Main {
    
    public static boolean isPalindrome(int num){
        
        int temp = num;
        int new_num = 0;
        int last_num;
        
        while (num > 0) {            
            last_num = num % 10;
            new_num = (new_num*10) + last_num;
            num /= 10;
        }
        if (temp == new_num) {
            return true;
        }else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        
        if (isPalindrome(number) == true) {
            System.out.println("It is PALINDROME.");
        }else {
            System.out.println("It is not palindrome.");
        }
        
    }
}
