package Nested;

public class OuterStatic {
    public static String x = "Hilmi";
    
    public static class InnerStatic{
        public static String x = "Baskoparan";
        
        public static void run(){
            System.out.println("*** Inner Class ***");
            int x = 5012;
            System.out.println(x);
            System.out.println(InnerStatic.x);
            System.out.println(OuterStatic.x);
        }
    }
    
    public void run(){
        System.out.println("*** Outer Class ***");
        InnerStatic.run();
    }
    
}
