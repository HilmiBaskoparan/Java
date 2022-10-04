
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        // Arrays Class
        int array[] = {3, 5, 79, 12, 25, -3, 66, 82, -49, 152};
        int[] array2 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};
        int[] array3 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        
        System.out.println(Arrays.toString(array));         // .toString()  : Printing the elements of the array as String
        Arrays.fill(array, 2);                              // .fill()      : Fill the array with a value
        System.out.println(Arrays.toString(array));
        Arrays.fill(array2, 2, 7, 7);                       // Arrays.fill(Object[] a, int fromIndex, int toIndex, Object val)
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array3);                                // Sort the array
        System.out.println(Arrays.toString(array3));
        int index = Arrays.binarySearch(array3, 33);        // Find the index of value in "SORTED" Array
        System.out.println("Index of 33 : " + index);
        
        int[] arr = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        int[] copyArray = Arrays.copyOf(arr, 3);                // copyOf(obeject[] a, int newLength)
        System.out.println(Arrays.toString(copyArray));
        int[] copyOfRangeArray = Arrays.copyOfRange(arr, 0, 5); // copyOf(obeject[] a, int from, int to)
        System.out.println(Arrays.toString(copyOfRangeArray));
        
        System.out.println(Arrays.equals(array, array2));   // check equality of the arrays
        
    }
}
