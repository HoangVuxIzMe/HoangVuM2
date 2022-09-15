package ss6_protected_in_java.point_2d_point_3d;

public class Run {
    public static void main(String[] args) {
//        Point2D objPoint2D = new Point2D(1.0f, 2.0f);
//        Point3D objPoint3D = new Point3D(1.5f, 2.5f, 3.5f);
//        System.out.println(objPoint2D);
//        System.out.println(objPoint3D);
        int[] a = {5, 6, 7, 8};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                continue;
            }
            System.out.print(i);
        }
    }
}
