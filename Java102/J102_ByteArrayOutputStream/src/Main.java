
import java.io.ByteArrayOutputStream;

public class Main {
    public static void main(String[] args) {
        
        String data = "Patika ile Java Öğreniyorum";

        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] array = data.getBytes();

            out.write(array);

            String streamData = out.toString();
            System.out.println("Çıkış akışı : " + streamData);

            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        
        String data2 = "Patika ile Java Dersleri";
        
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] array = data2.getBytes();

            out.write(array);
            
            String stringData = out.toString();
            System.out.println("\nData using toString(): " + stringData);
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        
        
    }
}
