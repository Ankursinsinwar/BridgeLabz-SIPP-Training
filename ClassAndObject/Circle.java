package ClassAndObject;

// Class Definition 
public class Circle {

    // Atributes
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display the area and circumference of the circle
    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    // Main method
    public static void main(String[] args) {

        // create circle objects
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(10.0);

        // display the area and circumference of the circle
        System.out.println("\n===  circle 1 ==="); 
        circle1.display();
        System.out.println("\n===  ciecle 1 ==="); 
        circle2.display();
    }
}
