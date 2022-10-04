public class Main {
    public static void main(String[] args) {
        
        Fighter f1 = new Fighter("Hilmi", 25, 100, 80, 35);
        Fighter f2 = new Fighter("John", 22, 125, 85, 15);
        Fighter f3 = new Fighter("Nur", 17, 70, 45, 0);
        Fighter f4 = new Fighter("Büşra", 16, 65, 45, 0);
        
        //f1.hit(f2);
        
        Ring match1 = new Ring(f1, f2, 80, 90);
        match1.run();
        //System.out.println("************************\nFIGHT 2\n************************");
        //Ring match2 = new Ring(f3, f4, 45, 55);
        //match2.run();
    }
}
