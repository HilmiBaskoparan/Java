
import java.util.Scanner;

public class Main {
    
    public static void power(int base, int power) {
        for (int i = 1; i < power; i++) {
            base *= base;
        }
        System.out.println(base);
    }
    
    public static int rePower(int base, int power) {
        if (power > 0 ) {
            return base * rePower(base, power-1);
        }else {
            return base;
        }
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isRecursivePrime(int number, int i) {
        if (number <= 2) {
            return (number == 2) ? true : false;
        }
        if (number % i == 0) {
            return false;
        }
        if (i * i > number) {
            return true;
        }
        return isRecursivePrime(number, i+1);
    }
    
    public static void pattern(int number) {
        int count = 0;
        while(-5 < number){
            System.out.print(number+" ");
            number -= 5;
            count++;
        }
        number += 5;
        while(1 < count){
            number += 5;
            System.out.print(number+" ");
            count--;
        }
    }
    
    public static void pattern2(int number) {
        int count = 0;
        do {
            System.out.print(number + " ");
            number -= 5;
            count++;
        } while (number > 0);
        for (int i = 0; i <= count; i++) {
            System.out.print(number + " ");
            number += 5;
        }
    }
    
    public static int recursivePattern(int number, int count) {
        if (number > 0) {
            System.out.print(number + " ");
            number -= 5;
            return number - recursivePattern(number,count+1);
        }
        while (count >= 0) {
            System.out.print(number + " ");
            number += 5;
            count--;
        }
        return number;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        
        /*
        System.out.print("Squart of Number  : " );power(number, 2);
        System.out.print("Cube of Number    : " + rePower(number, 3) + "\n");
        
        if (isPrime(number)) {
            System.out.println(number + " is a prime number"); 
        }else {
            System.out.println(number + " is not a prime number");
        }
        
        // Recursive Prime Number 
        if (isRecursivePrime(number, 2))
            System.out.println(number + " is a prime number");
        else
            System.out.println(number + " is not a prime number");
        */
        
        pattern(number);
        System.out.println("Show Pattern");
        
        pattern2(number);
        System.out.println("Show Pattern 2");
        
        recursivePattern(number, 0);
        System.out.println("Show Pattern Using Recursion");
        
    }
}