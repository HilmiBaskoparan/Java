package LoginOperations;

import AccountOperations.Account;
import AccountOperations.AccountManager;

import java.util.Scanner;

public class LoginSystem {
    Scanner scanner = new Scanner(System.in);
    AccountManager accountManager = new AccountManager();

    public void login() {
        System.out.println("********** Welcome to Insurance System **********");
        System.out.print("Enter Email       : ");
        String email = scanner.nextLine();
        System.out.print("Enter Password    : ");
        String password = scanner.nextLine();
        Account loginAccount = accountManager.login(email,password);
        if(loginAccount != null){
            loginAccount.showUserInfo();
            run(loginAccount);
        }
        else System.out.println("Invalid User");

    }

    private void run(Account account) {
        while (true){
            System.out.println("List of Operations");
            System.out.println("1- Show User Information\n" +
                               "2- Make a New Policy to User\n" +
                               "3- Add an Address to User\n" +
                               "4- Delete Address of User\n" +
                               "9- End the Program");
            System.out.print("select the action you want to do : ");
            int value = scanner.nextInt();

            switch (value) {
                case 1:
                    account.showUserInfo();
                    break;
                case 2:
                    account.addPolicy();
                    break;
                case 3:
                    account.addAddress();
                    break;
                case 4:
                    account.deleteAddress();
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }

}