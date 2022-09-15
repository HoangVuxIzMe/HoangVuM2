package ss6_protected_in_java.circle_cylinder;

public class Run {
    public static void main(String[] args) {
        Circle objCircle = new Circle(5.0,"Red");
        Cylinder objCylinder = new Cylinder(4.0,"Blue",8.5);
        System.out.println(objCircle);
        System.out.println(objCylinder);
    }
}
