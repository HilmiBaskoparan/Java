
import java.io.ByteArrayInputStream;

public class Main {
    public static void main(String[] args) {
        
        byte[] array = {1, 2, 3, 4};
        
        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array);

            System.out.println("Available bytes at the beginning: " + input.available());

            System.out.println("The bytes read from the input stream: ");
            for (int i = 0; i < array.length; i++) {
                int data = input.read();
                System.out.print(data + ", ");
            }
            System.out.println("Available bytes at the beginning: " + input.available());
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        
        System.out.println("");
        
        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array);
            
            // 2 baytlık veri atlanacaktır
            input.skip(2);

            int data = input.read();
            while (data != -1) {
                System.out.print(data + ", ");
                data = input.read();
            }

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        
    }
}
