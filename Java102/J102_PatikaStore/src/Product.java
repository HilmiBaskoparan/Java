public abstract class Product {

    private int id;
    private String productName;
    private double unitPrice;
    private int discountRate;
    private int amountOfStock;
    private Brand brand;
    private int memory;
    private double screenSize;
    private int ram;

    public Product(int id, String productName, double unitPrice, int discountRate, int amountOfStock, Brand brand, int memory, double screenSize, int ram) {
        this.id = id;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.amountOfStock = amountOfStock;
        this.brand = brand;
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    protected Product() {}

    public abstract void menu();
    public abstract void selectOperation();
    public abstract void listItems();
    public abstract void addItem();
    public abstract void deleteItem();
    public abstract void orderItems();
    public abstract void filterItems();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getAmountOfStock() {
        return amountOfStock;
    }

    public void setAmountOfStock(int amountOfStock) {
        this.amountOfStock = amountOfStock;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
