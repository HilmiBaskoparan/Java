import java.util.Comparator;
import java.util.TreeSet;

public class Brand {

    private int brandID;
    private String brandName;

    private static TreeSet<Brand> brandList = new TreeSet<>(new Comparator<Brand>() {
        @Override
        public int compare(Brand o1, Brand o2) {
            return o1.brandName.compareTo(o2.brandName);
        }
    });

    public Brand(int brandID, String brandName) {
        this.brandID = brandID;
        this.brandName = brandName;
    }

    static {
        createBrandList();
    }

    public static void createBrandList() {
        brandList.add(new Brand(1, "Samsung"));
        brandList.add(new Brand(2, "Lenovo"));
        brandList.add(new Brand(3, "Apple"));
        brandList.add(new Brand(4, "Huawei"));
        brandList.add(new Brand(5, "Casper"));
        brandList.add(new Brand(6, "Asus"));
        brandList.add(new Brand(7, "HP"));
        brandList.add(new Brand(8, "Xiaomi"));
        brandList.add(new Brand(9, "Monster"));
    }

    public static void showBrandList() {
        for (Brand b : brandList) {
            System.out.println(b.getBrandID() + "- " + b.getBrandName());
        }
        System.out.println("------------------------------------------");
    }

    public static Brand getBrandByID(int id) {
        for (Brand b : brandList) {
            if (id == b.getBrandID()){
                return b;
            }
        }
        return null;
    }

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
