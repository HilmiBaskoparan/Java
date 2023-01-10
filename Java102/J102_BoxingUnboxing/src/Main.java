public class Main {
    public static void main(String[] args) {
        
        int a = 10;
        
        // Autoboxing
        Integer b = a;  // Integer.valueOf(int a)
        
        // Boxing
        Integer c = Integer.valueOf(a); // Unnecessary Boxing
        
        // AutoUnboxing
        int d = c;  // c.intValue();
        
        // Unboxing
        int i = c.intValue();           // Unnecessary Unboxing
        
        
    }
}
