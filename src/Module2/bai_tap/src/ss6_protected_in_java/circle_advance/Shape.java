package ss6_protected_in_java.circle_advance;

public class Shape {
    private String color;

    public Shape() {
        this.color = "Red";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                ", color='" + color + '\'' +
                '}';
    }
}
