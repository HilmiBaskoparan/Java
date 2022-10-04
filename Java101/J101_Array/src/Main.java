public class Main {
    
    // Print Array with For Loop
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    // Print Array with Foreach
    public static void printArrayWithForeach(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    
    // Reversing the Array
    public static int [] reverseArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0, j = result.length-1; i < array.length; i++,j--) {
            result[j] = array[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        
        int[] array1;
        int array2[];
        
        int array3[] = {1,2,3,4,5};
        int array4[] = {10,20,30};
        
        
        printArray(array3);
        System.out.println("\n****************");
        
        printArrayWithForeach(array4);
        System.out.println("\n****************");
        
        printArray(reverseArray(array4));
        
    }
    
}
