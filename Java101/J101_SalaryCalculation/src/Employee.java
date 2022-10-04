public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raise;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax = 0;
        this.bonus = 0;
        this.raise = 0;
    }
    
    public void tax() {
        if (this.salary < 1000) {
            this.tax = 0;
        }else {
            this.tax = this.salary*0.03;
        }
    }
    
    public void bonus() {
        if (workHours > 40) {
            this.bonus = (workHours - 40) * 30;
        }else {
            this.bonus = 0;
        }
    }
    
    public void raiseSalary() {
        int now = 2021;
        if (now - hireYear < 10) {
            raise = this.salary*0.05;
        }
        else if ((now - hireYear > 9) && (now-hireYear < 20)) {
            raise = this.salary*0.1; 
        }
        else if (now-hireYear > 19) {
            raise = this.salary*0.15;
        }
    }
    
    public void showInfo() {
        System.out.println("Name                : " + this.name);
        System.out.println("Salary              : " + this.salary);
        System.out.println("Hours of Work       : " + this.workHours);
        System.out.println("Year of Hire        : " + this.hireYear);
        System.out.println("Tax                 : " + this.tax);
        System.out.println("Bonus               : " + this.bonus);
        System.out.println("Increase of Salary  : " + this.raise);
        System.out.println("Salary with Tax and Bonus: " + (salary + bonus - tax));
        System.out.println("Total Salary        : " + (salary + raise));
    }
    
}
