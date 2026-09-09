import java.util.Scanner;

public class RectangleDemo {
    private double length;
    private double width;

    public void setDimensions() {
        Scanner sc = new Scanner(System.in);
        System.out.print("  Length: ");
        length = sc.nextDouble();
        System.out.print("  Width: ");
        width = sc.nextDouble();
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        // Create three objects individually
        RectangleDemo r1 = new RectangleDemo();
        RectangleDemo r2 = new RectangleDemo();
        RectangleDemo r3 = new RectangleDemo();

        // Read dimensions for each
        System.out.println("Enter dimensions for Rectangle 1:");
        r1.setDimensions();

        System.out.println("Enter dimensions for Rectangle 2:");
        r2.setDimensions();

        System.out.println("Enter dimensions for Rectangle 3:");
        r3.setDimensions();

        // Calculate area and perimeter for each
        double area1 = r1.calculateArea();
        double perimeter1 = r1.calculatePerimeter();

        double area2 = r2.calculateArea();
        double perimeter2 = r2.calculatePerimeter();

        double area3 = r3.calculateArea();
        double perimeter3 = r3.calculatePerimeter();

        // Display results
        System.out.println("\n----- Rectangle Details -----");
        System.out.println("Rectangle 1 -> Area: " + area1 + ", Perimeter: " + perimeter1);
        System.out.println("Rectangle 2 -> Area: " + area2 + ", Perimeter: " + perimeter2);
        System.out.println("Rectangle 3 -> Area: " + area3 + ", Perimeter: " + perimeter3);
    }
}