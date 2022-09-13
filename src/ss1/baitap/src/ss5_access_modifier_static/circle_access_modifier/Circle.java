package ss5_access_modifier_static.circle_access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
