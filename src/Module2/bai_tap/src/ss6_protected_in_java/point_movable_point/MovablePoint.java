package ss6_protected_in_java.point_movable_point;

public class MovablePoint extends Point {
    private float xSpeed, ySpeed;

    public MovablePoint() {
        super();
        this.xSpeed = 0;
        this.ySpeed = 0;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setXY(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getXY() {
        return new float[]{xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return "MovablePoint{(" +
                super.getX() +
                ", " + super.getY() +
                "), speed=( " + getXSpeed() +
                ", " + getYSpeed() +
                ")}";
    }

    public MovablePoint move() {
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        return this;
    }
}
