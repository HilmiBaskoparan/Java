public class Circle {
    public int r;
    public final double PI = 3.14;
    
    public Circle(int r) {
        this.r = r;
    }
    
    public void calcArea() {
        double area = PI * this.r * this.r;
        System.out.println("Circle Area : " + area);
    }
    
}
