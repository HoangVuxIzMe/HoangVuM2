package ss6_protected_in_java.point_movable_point;

public class Run {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point.setX(0);
        point.setY(3);
        System.out.println(point);

        point.setXY(0,4);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint.setX(point.getX());
        movablePoint.setY(point.getY());

        movablePoint.setXSpeed(3);
        movablePoint.setYSpeed(2);

        movablePoint.move();
        //Example x= 0+3; y = 4+2;
        System.out.println(movablePoint);
    }
}
