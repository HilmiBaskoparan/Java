
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        MyList<Integer> numbers = new MyList<>();
        
        System.out.println("Number of Elements: " + numbers.size());
        System.out.println("Length of Array   : " + numbers.getCapacity());
        System.out.println("Is the list empty? : " + (numbers.isEmpty() ? "Yes" : "No"));
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        
        System.out.println("\nNumber of Elements: " + numbers.size());
        System.out.println("Length of Array   : " + numbers.getCapacity());
        
        numbers.remove(2);
        numbers.add(1);
        numbers.set(0, 20);
        
        System.out.println("\nNumber of Elements: " + numbers.size());
        System.out.println("Length of Array   : " + numbers.getCapacity());
        System.out.println(numbers.toStringList());
        //System.out.print("Enter a Index: ");
        //int index = input.nextInt();
        System.out.println("Value of " + 2 + ". Index: " + numbers.get(2));
        
        System.out.println("");
        System.out.println("First Index of Value: " + numbers.indexOf(20));
        System.out.println("Last Index of Value: " + numbers.lastIndexOf(20));
        
        System.out.println("Is the list empty? : " + (numbers.isEmpty() ? "Yes" : "No"));
        Object[] arr = numbers.toArray();
        System.out.println(arr[2]);
        
        //numbers.clear();
        System.out.println("Is the list empty? : " + (numbers.isEmpty() ? "Yes" : "No"));
        System.out.println(numbers.toStringList());
        
        
    }
}
