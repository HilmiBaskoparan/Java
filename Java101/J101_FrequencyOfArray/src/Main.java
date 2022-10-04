
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int[] array = {10,20,20,10,2,10,20,5,20,8,8};
        
        System.out.print("Array : " + Arrays.toString(array));
        System.out.println("\n\nRepeated Numbers");
        int count = 0;
        
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    for (int k = 0; k < i; k++) {
                        if (array[k] == array[j]) {
                            count = 0;
                        }
                    }
                }
            }
            if (count > 0) {
                System.out.println("Number " + array[i] + " is repeated " + count + " times");
            }
        }
        
    }
}
