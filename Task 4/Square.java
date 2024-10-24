//Square
public class Square implements Shape {
    private double side;

    //Konstruktør
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
