class Employee {
    public int employeeId;
    public String employeeName;
    public double salary;

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("ID         : " + this.employeeId);
        System.out.println("Name       : " + this.employeeName);
        System.out.println("Salary     : " + this.salary);
    }
}

class Manager extends Employee {
    public String department;
    public double bonus;

    public Manager(int employeeId, String employeeName, double salary, String department, double bonus) {
        super(employeeId, employeeName, salary);
        this.department = department;
        this.bonus = bonus;
    }

    public void displayManager() {
        this.displayEmployee();
        System.out.println("\nManager Details");
        System.out.println("---------------");
        System.out.println("Department : " + this.department);
        System.out.println("Bonus      : " + this.bonus);
    }
}

public class MainTask1 {
    public static void main(String[] args) {
        Manager mgr = new Manager(101, "Arun", 50000, "Sales", 15000);
        mgr.displayManager();
    }
}