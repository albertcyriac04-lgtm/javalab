class Employee{
    private String name;
    private int id;
    private double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    public double calculateSalary(){
        return this.baseSalary;
    }
}
class Manager extends Employee{
    private double bonus;
    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }
    public double calculateSalary() {
        return getBaseSalary()+bonus;
    }
}
class Developer extends Employee {
    private double projectAllowance;

    public Developer(String name, int id, double baseSalary, double projectAllowance) {
        super(name, id, baseSalary);
        this.projectAllowance = projectAllowance;

    }

    public double calculateSalary() {
        return getBaseSalary() + projectAllowance;
    }
}
class Intern extends  Employee{
        private double stipend;
        public Intern(String name, int id, double stipend) {
            super(name, id, 0);
            this.stipend = stipend;

        }

    @Override
    public double calculateSalary() {
        return stipend;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Inserting Employee Records ---");

        // Inserting data by creating object instances
        Manager mgr = new Manager("Alice Smith", 101, 80000, 15000);
        Developer dev = new Developer("Bob Jones", 102, 60000, 8000);
        Intern intern = new Intern("Charlie Brown", 103, 2500);

        System.out.println("Data insertion successful!\n");

        System.out.println("--- Processing and Printing Details ---");

        // Polymorphic array processing
        Employee[] employees = { mgr, dev, intern };

        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getId());
            System.out.println("Name: " + emp.getName());
            System.out.println("Calculated Salary: $" + emp.calculateSalary());
            System.out.println("-----------------------------------");
        }

        System.out.println("Execution completed successfully.");
    }
}
