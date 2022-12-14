package ss7_abstract_class_interface.resizeable;

public abstract class Shape implements IResizeable {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "a Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled,\n" : "not filled,\n");
    }

    public static void printShape(Shape[] shape){
        for (Shape x : shape){
            System.out.println(x.toString());
        }
    }
}