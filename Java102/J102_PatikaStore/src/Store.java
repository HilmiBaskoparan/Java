import java.util.Scanner;

public class Store {

    private Scanner input = new Scanner(System.in);

    public Store() {}

    public void run() {
        System.out.println("Welcome to Patika Store");
        menu();
        selectOperation();
    }

    public void menu() {
        String menu = "1 - Notebook Operations\n" +
                "2 - Mobile Phone Operations\n" +
                "3 - List the Brands\n" +
                "0 - QUIT";
        System.out.println(menu);
    }

    public void selectOperation() {

        while (true) {
            System.out.print("Enter your action: ");
            try {
                int selectOperation = input.nextInt();

                switch (selectOperation){
                    case 1:
                        Notebook notebook = new Notebook();
                        notebook.menu();
                        break;
                    case 2:
                        MobilePhone mobilePhone = new MobilePhone();
                        mobilePhone.menu();
                        break;
                    case 3:
                        Brand.showBrandList();
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid User Input. Please enter a value from 0 to 3!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid User Input. Please enter a value from 0 to 4!");
                break;
            }

        }



    }


}
