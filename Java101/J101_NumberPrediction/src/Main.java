
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int)(Math.random()*100);
        
        int selected;
        int right = 0;
        int[] predictions = new int[5];
        int illegal_num = 0;
        
        while (right < 5) {
            System.out.println("**********************************");
            System.out.print("Enter your guess : ");
            selected = input.nextInt();
            
            if (selected > 0 && selected < 100) {
                predictions[right] = selected;
                if (selected == number) {
                    System.out.println("Congratulations you find it !!!");
                    break;
                } else {
                    System.out.println("You entered Wrong Number");
                    if (selected > number) {
                        System.out.println("The unknown number is LESS than the number you entered");
                    }else {
                        System.out.println("The unknown number is BIGGER than the number you entered");
                    }
                    right++;
                    System.out.println("Your Rights : " + (5-right));
                }
            }else {
                System.out.println("Please Enter a mumber between 1 and 100."
                                 + "\nIf you enter the wrong number again, your rights will decreaced by 1!!!");
                illegal_num++;
                if (illegal_num > 1) {
                    right++;
                    System.out.println("Your Rights : " + (5-right));
                }
            }
        }
        
        if (right >= 5) {
            System.out.println("We are sorry, YOU LOST :(");
            System.out.println("Number is " + number);
        }
        for (int prediction : predictions) {
            if (prediction != 0) {
                System.out.print(prediction + " ");
            }
        }
        
    }
}
