import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MobilePhone extends Product {

    private int battery;
    private String color;
    private Scanner scan = new Scanner(System.in);
    private ArrayList<MobilePhone> mobilePhones = new ArrayList<>();

    public MobilePhone() {}

    public MobilePhone(int id, String productName, double unitPrice, int discountRate, int amountOfStock, Brand brand, int memory, double screenSize, int ram, int battery, String color) {
        super(id, productName, unitPrice, discountRate, amountOfStock, brand, memory, screenSize, ram);
        this.battery = battery;
        this.color = color;
    }

    @Override
    public void menu() {
        mobilePhones.add(new MobilePhone(15, "Samsung Galaxy A51", 6400, 5, 6, Brand.getBrandByID(1), 128, 6.5, 6, 4000, "Siyah"));
        mobilePhones.add(new MobilePhone(11, "IPhone 11 64GB", 18000, 0, 3, Brand.getBrandByID(3), 64, 6.1, 8, 3046, "Mavi"));
        mobilePhones.add(new MobilePhone(12, "Redmi Note 10 Pro 8GB", 8000, 10, 5, Brand.getBrandByID(8), 128, 6.5, 12, 4000, "Beyaz"));

        String menu = "1- List the Mobile Phones\n" +
                "2- Add a Mobile Phone\n" +
                "3- Delete a Mobile Phone\n" +
                "4- Order the Mobile Phone List\n" +
                "5- Filter the Mobile Phones\n" +
                "9 - Pass the Previous Menu\n" +
                "0- QUIT";

        while (true) {
            System.out.println("***** Mobile Phone Operations *****");
            System.out.println(menu);
            selectOperation();
        }
    }

    @Override
    public void selectOperation() {
        System.out.print("Select an action : ");
        int selectPhoneAction = scan.nextInt();

        switch (selectPhoneAction){
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
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   | Pil Kapasitesi  | Renk           | Kamera    |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (MobilePhone p: this.mobilePhones){
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s | \n",
                    p.getId(),p.getProductName(),p.getUnitPrice(),p.getBrand().getBrandName(),p.getAmountOfStock(),
                    p.getDiscountRate(),p.getRam(),p.getScreenSize(),p.getMemory(),p.getBattery(),p.getColor());
        }
        if (mobilePhones.size() == 0) {
            System.out.println("\t\t\t\t\t\t\t\tList of Phone is Empty.");
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
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
        System.out.print("RAM       : ");
        int ram = scan.nextInt();
        System.out.print("ScreenSize: ");
        double screenSize = scan.nextDouble();
        System.out.print("Battery   : ");
        int battery = scan.nextInt();
        System.out.print("Color     : ");
        String color = scan.next();

        this.mobilePhones.add(new MobilePhone(id, name, price, disc, stock, brand, memory, screenSize, ram, battery, color));
    }

    @Override
    public void deleteItem() {
        listItems();
        System.out.print("Enter the Phone ID which you want to DELETE: ");
        int id = scan.nextInt();

        if (getPhoneById(id) != null) {
            mobilePhones.remove(getPhoneById(id));
            System.out.println("Current Notebook List");
            listItems();
        } else {
            System.out.println("\n******************************");
            System.out.println("THERE IS NO SUCH PHONE!");
            System.out.println("******************************");
            deleteItem();
        }
    }

    @Override
    public void orderItems() {
        Collections.sort(mobilePhones, (o1, o2) -> {
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
        switch(filter) {
            case 1:
                filterPhoneById();
                break;
            case 2:
                filterPhoneByBrand();
                break;
            case 0:
                MobilePhone p = new MobilePhone();
                p.menu();
                break;
            default:
                break;
        }
    }

    public void filterPhoneByBrand() {
        System.out.print("Enter brand to FILTER: ");
        String filterBrand = scan.next();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   | Pil Kapasitesi  | Renk           | Kamera    |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        boolean empty = true;
        for (MobilePhone pho: this.mobilePhones){
            if (pho.getBrand().getBrandName().equalsIgnoreCase(filterBrand)) {
                System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s | \n",
                        pho.getId(),pho.getProductName(),pho.getUnitPrice(),pho.getBrand().getBrandName(),pho.getAmountOfStock(),
                        pho.getDiscountRate(),pho.getRam(),pho.getScreenSize(),pho.getMemory(),pho.getBattery(),pho.getColor());
                empty = false;
            }
        }
        if (empty) {
            System.out.println("\t\t\t\t\t\t\t\tThere is no " + filterBrand + " phone.");
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void filterPhoneById() {
        System.out.print("Enter ID to FILTER: ");
        int filterId = scan.nextInt();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   | Pil Kapasitesi  | Renk           | Kamera    |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        boolean empty = true;
        for (MobilePhone pho: this.mobilePhones){
            if (pho.getId() == filterId) {
                System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s | \n",
                        pho.getId(),pho.getProductName(),pho.getUnitPrice(),pho.getBrand().getBrandName(),pho.getAmountOfStock(),
                        pho.getDiscountRate(),pho.getRam(),pho.getScreenSize(),pho.getMemory(),pho.getBattery(),pho.getColor());
                empty = false;
            }
        }
        if (empty) {
            System.out.println("\t\t\t\t\t\t\t\tThere is no phone which has " + filterId + " ID Number.");
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public MobilePhone getPhoneById(int id) {
        for (MobilePhone p : this.mobilePhones) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
