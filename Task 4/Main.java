//Main
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);

        ShapeBuilder builder = new ShapeBuilder();
        builder.addShape(circle);
        builder.addShape(square);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Total area: " + builder.getTotalArea());
    }
}
