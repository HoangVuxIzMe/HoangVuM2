package ss6_protected_in_java.point_2d_point_3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x= " + super.getX() +
                ", y= " + super.getY() +
                ", z= " + this.getZ() +
                "}";
    }
}
