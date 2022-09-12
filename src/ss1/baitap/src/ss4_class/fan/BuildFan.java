package ss4_class.fan;

public class BuildFan {
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public BuildFan(){

    }
    public BuildFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 1 && speed <= 3) {
            this.speed = speed;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String statusOfFan = "";
        if (this.isOn()) {
            System.out.print("Fan is on" + "\nSpeed: " + this.speed + ", ");
        } else {
            System.out.print("Fan is off" + ", ");
        }
        statusOfFan += "\nColor: " + this.color + "\nRadius: " + this.radius;
        return statusOfFan;
    }
}
