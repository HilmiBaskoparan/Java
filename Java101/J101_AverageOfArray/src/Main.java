
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        // Average of the array elements
        int[] array = {2,5,10,8,15};
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        int avg = sum / array.length;
        System.out.println(Arrays.toString(array));
        System.out.println("Average : " + avg);
        
        // Harmonic Average : 1 + 1/2 + 1/3 + 1/4 
        double sumH = 0;
        for (int i : array) {
            sumH += 1.0/i;
        }
        
        System.out.println("Harmonic Serie   : " + sumH);
        System.out.println("Harmonic Average : " + sumH/array.length);
    }
}
