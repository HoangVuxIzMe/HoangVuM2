package ss6_protected_in_java.circle_cylinder;

public class Circle {
    public double radius;
    public String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (this.radius > 0) {
            this.radius = radius;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double circleArea() {
        return Math.pow(getRadius(), 2.0) * Math.PI;
    }

    public String toString() {
        return "Color: " + color + "\nRadius: " + radius + "\nArea Circle: " + circleArea();
    }
}
