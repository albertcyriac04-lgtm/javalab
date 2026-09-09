class Shape {
    private String shape;

    // FIX 1: Corrected 'publics' typo to 'public'
    public Shape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    // FIX 2: Added missing parentheses '()' to the method signature
    public double area() {
        System.out.println("Executing: area()");
        return 0.0;
    }
}

// FIX 3: Changed 'circle' to uppercase 'Circle' to match standard naming conventions
class Circle extends Shape {
    private double radius;

    public Circle(String shape, double radius) {
        super(shape);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shape, double width, double height) {
        super(shape);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String shape, double base, double height) {
        super(shape);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class FindArea {
    public static void main(String[] args) {

        /* * FIX 4: Passed the required String argument ("Circle", "Rectangle", etc.)
         * to match the constructor signatures defined in the subclasses.
         */
        Shape s1 = new Circle("Circle", 5.0);
        Shape s2 = new Rectangle("Rectangle", 4.0, 6.0);
        Shape s3 = new Triangle("Triangle", 3.0, 8.0);

        // Direct Area Calculation & Print Execution
        System.out.println(s1.getShape() + " Area    : " + s1.area());
        System.out.println(s2.getShape() + " Area : " + s2.area());
        System.out.println(s3.getShape() + " Area  : " + s3.area());
    }
}