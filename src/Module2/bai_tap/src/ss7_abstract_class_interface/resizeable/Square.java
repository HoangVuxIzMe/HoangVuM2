package ss7_abstract_class_interface.resizeable;

public class Square extends Shape {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getSide()
                + ", which is a subclass of "
                + super.toString()
                + "Area= "
                + getArea()
                + ", Perimeter= "
                + getPerimeter()
                + ", Color: "
                + getColor()
                + "\n";
    }

    @Override
    public void resize(double percent) {
        this.side *= (percent / 200);
    }
}
