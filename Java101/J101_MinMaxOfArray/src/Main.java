
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int[] array = {20, 15, 27, -6, 33, 2, -12};
        
        int min = array[0];
        int max = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i]; 
            }
            if (max > array[i]) {
                max = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("MIN : " + min);
        System.out.println("MAX : " + max);
        
        // Closest Numbers to Entered Number
        Scanner scan = new Scanner(System.in);
        Arrays.sort(array);
        System.out.println("\nSorted Array : " + Arrays.toString(array));
        System.out.print("\nEnter a Number : ");
        int number = scan.nextInt();
        
        int min2 = array[0];
        int max2 = array[0];
        
        for(int i : array){
            if (i < number){
                min2 = i;
            }
            if (i > number){
                max2 = i;
                break;
            }
        }
        
        System.out.println("Closet Min : " + min2);
        System.out.println("Far Max : " + max2);
        
    }
}
