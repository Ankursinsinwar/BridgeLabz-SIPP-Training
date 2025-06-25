package Level1;

// class definition
public class Circle {

    // Atribute
    double radius;

    // constructure chaining
    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // main method
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3.5);

        System.out.println("Circle 1 radius: " + c1.radius);
        System.out.println("Circle 2 radius: " + c2.radius);
    }
}
