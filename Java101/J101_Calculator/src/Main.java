
import java.util.Scanner;

public class Main {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void add() {
        System.out.println("***** ADD *****");
        int number, result = 0, i = 1;
        while (true) {
            System.out.print("Number " + (i++) + " : ");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result = " + result + "\n");
    }
    
    public static void substract() {
        System.out.println("***** SUBSTRACT *****");
        int count, number, result = 0;
        System.out.print("How many numbers will you enter : ");
        count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print("Number " + i + " : ");
            number = input.nextInt();
            if (i == 1) {
                result = number;
                continue;
            }
            result -= number;
        }
        System.out.println("Result = " + result + "\n");
    }
    
    public static void multipy() {
        System.out.println("***** MULTIPY *****");
        int number, result = 1, i = 1;
        while (true) {
            System.out.print("Number " + i + " : ");
            number = input.nextInt();
            if (number == 1) {
                break;
            }
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Result = " + result + "\n");
    }
    
    public static void divide() {
        System.out.println("***** DIVISION *****");
        double number, result = 0.0;
        System.out.print("How many numbers will you enter : ");
        int count = input.nextInt();
        
        for (int i = 1; i <= count; i++) {
            System.out.print("Number " + i + " : ");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("No Division by 0...");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Result = " + result + "\n");
    }
    
    public static void power() {
        System.out.println("*** POWER OF NUMBER ***");
        int number, power, result = 1;
        System.out.print("Enter a number        : ");
        number = input.nextInt();
        System.out.print("Enter power of number : ");
        power = input.nextInt();
        
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println("Result = " + result + "\n");
    }
    
    public static void factorial() {
        System.out.println("***** FACTORIAL *****");
        int number, result = 1;
        System.out.print("Enter a number : ");
        number = input.nextInt();
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        System.out.println("Result = " + result + "\n");
    }
    
    public static void mod() {
        System.out.println("***** MODE *****");
        int number, divisor, result = 0;
        System.out.print("Enter a number : ");
        number = input.nextInt();
        System.out.print("Mode of number : ");
        divisor = input.nextInt();
        result = number % divisor;
        System.out.println("Result = " + result + "\n");
    }
    
    public static void rectangleArea() {
        System.out.println("Area and Circumference of Rectangle");
        int width, length;
        System.out.print("Enter Short Edge : ");
        width = input.nextInt();
        System.out.print("Enter Long Edge  : ");
        length = input.nextInt();
        
        System.out.println("Rectangle Area          = " + (width*length));
        System.out.println("Rectangle Circumference = " + 2*(width+length) + "\n");
    }
    
    public static void selectAction(int islem) {
        switch (islem) {
            case 0:
                System.out.println("Exiting the Calculator...BYE");
                break;
            case 1:
                add();
                break;
            case 2:
                substract();
                break;
            case 3:
                multipy();
                break;
            case 4:
                divide();
                break;
            case 5:
                power();
                break;
            case 6:
                factorial();
                break;
            case 7:
                mod();
                break;
            case 8:
                rectangleArea();
                break;
            default:
                System.out.println("Wrong Selection. PLEASE Try Again...\n");
        }
    }
    
    public static void main(String[] args) {
        
        String actions = "1. Add\n"
                       + "2. Substract\n"
                       + "3. Multipy\n"
                       + "4. Divide\n"
                       + "5. Power Of Number\n"
                       + "6. Factorial\n"
                       + "7. Mode Of Number\n"
                       + "8. Area and Circumference of Rectangle\n"
                       + "0. QUIT";
        int choose;
        
        System.out.println("***** WELCOME TO CALCULATOR *****");
        
        do {            
            System.out.println(actions);
            System.out.print("Select Your Action : ");
            choose = input.nextInt();
            selectAction(choose);
        } while (choose != 0);
        
    }
}
