package ss7_abstract_class_interface.colorable;

public class RunShape {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "Yellow", false);
        shapes[1] = new Rectangle(x, x, "Blue", true);
        shapes[2] = new Square(x, "Red", true);
        Shape.printShape(shapes);
        for (Shape a : shapes) {
            if (a != null) {
                ((Colorable) a).howToColor();
            }
        }
    }
}
