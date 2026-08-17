abstract class Employee1 {

    protected String name;
    private int id;

    Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract double calculatePay();

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + calculatePay());
        System.out.println();
    }
}

class FullTimeEmployee extends Employee1 {

    private double monthlySalary;

    FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculatePay() {
        return monthlySalary;
    }
}

class ContractEmployee extends Employee1 {

    private double hours;
    private double rate;

    ContractEmployee(int id, String name, double hours, double rate) {
        super(id, name);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    double calculatePay() {
        return hours * rate;
    }
}

public class Employee {

    public static void main(String[] args) {

        Employee1[] employees = new Employee1[3];

        employees[0] =
                new FullTimeEmployee(101, "Rahul", 50000);

        employees[1] =
                new ContractEmployee(102, "Anu", 80, 500);

        employees[2] =
                new FullTimeEmployee(103, "Arun", 60000);

        for (int i = 0; i < employees.length; i++) {
            employees[i].display();
        }
    }
}