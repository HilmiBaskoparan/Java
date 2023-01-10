package Nested;

public class Local {
    
    public void run() {
        
        class LocalC{
            private int x;
            
            public LocalC(int x){
                this.x = x;
            }

            public int getX() {
                return x;
            }

            public void setX(int x) {
                this.x = x;
            }
            
        }
        
        LocalC l = new LocalC(10);
        System.out.println("Local Class is running...");
        System.out.println(l.getX());
    }
    
}
