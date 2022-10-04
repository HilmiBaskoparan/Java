
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        /*
        System.out.print("Write Employee Name : ");
        String name = scan.nextLine();
        System.out.print("Salary : ");
        String salary = scan.nextLine();
        System.out.print("Write Employee Name : ");
        String workHours = scan.nextLine();
        System.out.print("Write Employee Name : ");
        String hireYear = scan.nextLine();
        */
        
        Employee e1 = new Employee("Hilmi", 10303, 40, 2010);
        
        e1.tax();
        e1.bonus();
        e1.raiseSalary();
        
        e1.showInfo();
    }
}
