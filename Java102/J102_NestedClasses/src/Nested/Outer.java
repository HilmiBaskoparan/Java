package Nested;

public class Outer {
    public int a = 20;
    
    public class Inner {
        public int a = 10;
        
        public void run(){
            int a = 5;
            System.out.println(a);              // a value of method
            System.out.println(this.a);         // a value of Inner Class
            System.out.println(Outer.this.a);   // a value of Outer Class
        }
    }
    
    public void run() {
        System.out.println("Outer Class Run Method");
        Inner in = new Inner();
        in.run();
    }
    
    public Inner getIn(){
        return new Inner();
    }
}
