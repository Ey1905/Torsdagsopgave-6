public class Circle implements Shape {
    private double radius;

    //Konstruktør
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

