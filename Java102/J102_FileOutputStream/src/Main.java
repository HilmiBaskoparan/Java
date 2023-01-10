
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        
        File file = new File("D:/PHP/test.txt");
        String data = "I am learning JAVA!!";
        
        try {
            FileOutputStream output = new FileOutputStream(file);
            byte[] array = data.getBytes();
            output.write(array);
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        
    }
    
}
