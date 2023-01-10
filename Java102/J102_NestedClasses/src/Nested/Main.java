package Nested;

public class Main {
    public static void main(String[] args) {
        
        Outer o = new Outer();
        o.run();
        System.out.println("");
        
        Outer.Inner in = o.new Inner();
        in.run();
        System.out.println("");
        
        o.getIn();
        o.run();    // Outer
        System.out.println("");
        in.run();   // Inner
        
        
        // ******* STATIC INNER OUTER CLASSES *******
        OuterStatic os = new OuterStatic();
        os.run();
        
        System.out.println("\n");
        OuterStatic.InnerStatic.run();
        
        
        // ******* LOCAL CLASSSES *******
        System.out.println("");
        Local l = new Local();
        l.run();
        
        
        // ******* ANONIM CLASSSES *******
        System.out.println("");
        Anonim a = new Anonim(){
            @Override
            public void run() {
                System.out.println("Run method writen by Anonim");
                print();
            }
            public void print(){
                System.out.println("Print method");
            }
        };
        
        a.run();
        
        Anonim b = new Anonim();
        b.run();
        
    }
}
