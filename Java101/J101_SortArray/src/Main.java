
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Length of the array : ");
        int n = input.nextInt();
        System.out.println("Enter the elements of array");
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print(i+1 + ". Element : ");
            array[i] = input.nextInt();
        }
        
        Arrays.sort(array);
        
        System.out.println("\n********** Sorted Array **********");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
