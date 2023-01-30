import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Notebook extends Product {

    private Scanner scan = new Scanner(System.in);
    private ArrayList<Notebook> notebooks = new ArrayList<>();

    public Notebook() {}

    public Notebook(int id, String productName, double unitPrice, int discountRate, int amountOfStock, Brand brand, int memory, double screenSize, int ram) {
        super(id, productName, unitPrice, discountRate, amountOfStock, brand, memory, screenSize, ram);
    }
    @Override
    public void menu() {
        notebooks.add(new Notebook(15, "HUAWEI Matebook 14", 14000, 10, 2, Brand.getBrandByID(4) , 512, 14, 16));
        notebooks.add(new Notebook(22, "Lenovo V14 IGL", 10000, 5, 4, Brand.getBrandByID(2), 1024, 14, 8));
        notebooks.add(new Notebook(3, "Asus Tuf Gaming", 22000, 10, 5, Brand.getBrandByID(6), 2048, 15.6, 32));

        String menu = "1- List the Notebooks\n" +
                "2- Add a Notebook\n" +
                "3- Delete a Notebook\n" +
                "4- Order the Notebook List\n" +
                "5- Filter the Notebooks\n" +
                "9 - Pass the Previous Menu\n" +
                "0- QUIT";

        while(true) {
            System.out.println("***** Notebook Operations *****");
            System.out.println(menu);
            selectOperation();
        }

    }

    @Override
    public void selectOperation() {
        System.out.print("Select an action : ");
        int selectNotebookAction = scan.nextInt();

        switch (selectNotebookAction){
            case 1:
                listItems();
                break;
            case 2:
                addItem();
                break;
            case 3:
                deleteItem();
                break;
            case 4:
                orderItems();
                break;
            case 5:
                filterItems();
                break;
            case 9:
                System.out.println();
                Store s = new Store();
                s.run();
                break;
            case 0:
                System.out.println("The program is ending...");
                System.exit(0);
                break;
        }


    }

    @Override
    public void listItems() {
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Notebook n: notebooks) {
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                    n.getId(), n.getProductName(), n.getUnitPrice(), n.getBrand().getBrandName(),
                    n.getAmountOfStock(), n.getDiscountRate(), n.getRam(), n.getScreenSize(), n.getMemory());
        }

        if (notebooks.size() == 0){
            System.out.println("\t\t\t\t\t\t\t\tList of Notebook is Empty.");
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public void addItem() {
        System.out.print("ID        : ");
        int id = scan.nextInt();
        System.out.print("Name      : ");
        String name = scan.next();
        System.out.print("Price     : ");
        Double price = scan.nextDouble();
        System.out.print("Discount  : ");
        int disc = scan.nextInt();
        System.out.print("Stock     : ");
        int stock = scan.nextInt();
        System.out.print("Brand     : ");
        Brand brand = Brand.getBrandByID(scan.nextInt());
        System.out.print("Memory    : ");
        int memory = scan.nextInt();
        System.out.print("ScreenSize: ");
        double screenSize = scan.nextDouble();
        System.out.print("RAM       : ");
        int ram = scan.nextInt();

        this.notebooks.add(new Notebook(id, name, price, disc, stock, brand, memory, screenSize, ram));
        System.out.println(name + " is added");
    }

    @Override
    public void deleteItem() {
        listItems();
        System.out.print("Enter the Notebook ID which you want to DELETE: ");
        int id = scan.nextInt();
        if (getNotebookByID(id) != null) {
            notebooks.remove(getNotebookByID(id));
            System.out.println("Current Notebook List");
            listItems();
        } else {
            System.out.println("\n******************************");
            System.out.println("THERE IS NO SUCH NOTEBOOK!");
            System.out.println("******************************");
            deleteItem();
        }
    }

    @Override
    public void orderItems() {
        Collections.sort(notebooks, (o1, o2) -> {
            return o1.getId() - o2.getId();
        });
        listItems();
    }

    @Override
    public void filterItems() {
        System.out.println("1 - ID\n" +
                "2 - Brand\n" +
                "0 - Pass the Previous Menu");
        System.out.print("Select the field you want to FILTER: ");
        int filter = scan.nextInt();

        switch (filter) {
            case 1:
                filterNotebookByID();
                break;
            case 2:
                filterNotebookByBrand();
                break;
            case 0:
                Notebook n = new Notebook();
                n.menu();
                break;
            default:
                break;
        }

    }

    public void filterNotebookByID() {
        System.out.print("Enter ID to FILTER: ");
        int filterID = scan.nextInt();
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        boolean empty = true;
        for (Notebook n : notebooks) {
            if (n.getId() == filterID) {
                System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                        n.getId(), n.getProductName(), n.getUnitPrice(), n.getBrand().getBrandName(), n.getAmountOfStock(),
                        n.getDiscountRate(),n.getRam(),n.getScreenSize(),n.getMemory());
                empty = false;
            }
        }
        if (empty) {
            System.out.println("\t\t\t\t\t\t\t\tThere is no notebook which has " + filterID + " ID Number.");
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public void filterNotebookByBrand() {
        System.out.print("Enter ID to FILTER: ");
        String filterBrand = scan.next();
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        boolean empty = true;
        for (Notebook n : notebooks) {
            if (n.getBrand().getBrandName().equalsIgnoreCase(filterBrand)) {
                System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                        n.getId(), n.getProductName(), n.getUnitPrice(), n.getBrand().getBrandName(), n.getAmountOfStock(),
                        n.getDiscountRate(),n.getRam(),n.getScreenSize(),n.getMemory());
                empty = false;
            }
        }
        if (empty) {
            System.out.println("\t\t\t\t\t\t\t\tThere is no " + filterBrand + " notebook.");
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public Notebook getNotebookByID(int id) {
        for (Notebook n: notebooks) {
            if (id == n.getId()){
                return n;
            }
        }
        return null;
    }

}
