
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        String transaction = "1-Deposit Money\n"
                           + "2-Withdraw Money\n"
                           + "3-Show Balance\n"
                           + "4-QUIT";
        
        while (right > 0) {            
            System.out.print("Username  : ");
            userName = input.nextLine();
            System.out.print("Password  : ");
            password = input.nextLine();
            
            if (userName.equals("hilmi") && password.equals("123")) {
                System.out.println("Hello! Welcome to Our Bank...");
                do {                    
                    System.out.println(transaction);
                    System.out.print("Choose Your Transaction   : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Amount to Deposit     : ");
                            int deposit = input.nextInt();
                            balance += deposit;
                            System.out.println("Current Balance     : " + balance);
                            break;
                        case 2:
                            System.out.print("Amount to Withdraw    : ");
                            int withdraw = input.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Your balance is not enough. Your Balance is " + balance);
                            }else {
                                balance -= withdraw;
                                System.out.println("New Balance     : " + balance);
                            }   break;
                        case 3:
                            System.out.println("Current Balance     : " + balance);
                            break;
                        case 4:
                            System.out.println("Exiting the Program. BYE...");
                            return;
                        default:
                            System.out.println("Wrong Transaction Selection!");
                            break;
                    }
                } while (true);
                
            }else {
                System.out.print("Username or password is incorrect");
                right--;
                if (right == 0) {
                    System.out.println("\nYour login rights is over.");
                }else {
                    System.out.println("Please Try Again...");
                    System.out.println("Remaining Right of Login " + right);
                }
            }
        }
        
        
    }
}
