package ss5_access_modifier_static.circle_access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.0);
        Circle circle3 = new Circle(3.0,"Blue");
        System.out.println("Hàm không tham số: \nRadius: " + circle1.getRadius()+"\nColor: "+circle1.getColor());
        System.out.println("Hàm 1 tham số: \nRadius: " + circle2.getRadius());
        System.out.println("Hàm 2 tham số: \nRadius: " + circle3.getRadius()+"\nColor: "+circle3.getColor());
    }
}
