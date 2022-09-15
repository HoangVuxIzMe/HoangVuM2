package ss6_protected_in_java.circle_cylinder;

public class Cylinder extends Circle {
    public double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (this.height > 0) {
            this.height = height;
        }
    }

    public double cylindricalVolume() {
        return Math.pow(radius, 2.0) * Math.PI * height;
    }

    public String toString() {
        return "Color: " + color + "\nRadius: " + radius + "\nHeight: " + height + "\nCylindrical Volume: " + cylindricalVolume();
    }
}
