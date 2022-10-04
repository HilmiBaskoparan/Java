public class User {
    public String name;
    public static int counter;
    
    static {
        int random = (int)(Math.random()*10);
        counter = random;
        System.out.println("Random Counter Value : " + counter);
    }
    
    public User(String name) {
        this.name = name;
        counter++;
        System.out.println("Counter New Value : " + counter);
    }
}
