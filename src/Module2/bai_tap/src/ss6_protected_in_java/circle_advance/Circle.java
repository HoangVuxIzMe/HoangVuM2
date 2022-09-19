package ss6_protected_in_java.circle_advance;

public class Circle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Circle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Circle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        if (this.side1 > 0) {
            this.side1 = side1;
        }
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        if (this.side2 > 0) {
            this.side2 = side2;
        }
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        if (this.side3 > 0) {
            this.side3 = side3;
        }
    }

    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        double height = 2 * ((Math.sqrt(p * (p - side1) * (p - side2) * (p - side3))) / side1);
        double area =  0.5 * height * side3;
        return area;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Color: " + super.getColor() +
                ", Area= " + Math.ceil(getArea()) +
                ", Perimeter= " + Math.ceil(getPerimeter()) +
                '}';
    }
}
