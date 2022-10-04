
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        // Find the repeating numbers in array
        int[] array = {1,4,7,10,4,13,16,7,19,20,13,16,20};
        int[] result = new int[array.length];
        
        Arrays.toString(array);
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    result[i] = array[i];
                }
            }
            
        }
        
        System.out.println("ARRAY\n" + Arrays.toString(array));
        System.out.println(Arrays.toString(result));
        
        System.out.print("Duplicate All Numbers     : ");
        for (int i : result) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.print("\nDuplicate Even Numbers    : ");
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0 && result[i] % 2 == 0) {
                System.out.print(result[i] + " ");
            }   
        }
        System.out.print("\nDuplicate Odd Numbers     : ");
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0 && result[i] % 2 == 1) {
                System.out.print(result[i] + " ");
            }   
        }
        System.out.println("");
        
    }
}
