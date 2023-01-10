
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        
        try {
            FileInputStream input = new FileInputStream("D:/PHP/test.txt");
            System.out.println("Dataes in the file: ");
            
            // Read First Byte
            int i = input.read();
            
            while (i != -1) {
                // Byte to char
                System.out.print((char) i);
                // Read Next Byte
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        
        System.out.println("\n");
        
        try {
            FileInputStream input = new FileInputStream("D:/PHP/test.txt");
            
            // Kullanılabilir bayt sayısını verir
            System.out.println("Available Bytes : " + input.available());
            
            // Dosyadan 3 baytlık veri okur
            input.read();
            input.read();
            input.read();
            
            // Kullanılabilir bayt sayısını verir
            System.out.println("Available Bytes : " + input.available());
            
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        
        
        try {
            FileInputStream input = new FileInputStream("D:/PHP/test.txt");
            
            // 5 byte atlanacaktır
            input.skip(5);
            System.out.println("5 bytes of data skipped : ");
            
            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        
    }
}
