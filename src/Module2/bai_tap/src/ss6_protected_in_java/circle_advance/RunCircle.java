package ss6_protected_in_java.circle_advance;

import java.util.Scanner;

public class RunCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh a= ");
        double side1 = sc.nextDouble();
        System.out.print("Nhập độ dài cạnh b= ");
        double side2 = sc.nextDouble();
        System.out.print("Nhập độ dài cạnh c= ");
        double side3 = sc.nextDouble();
        Circle circle = new Circle();
        Circle circle1 = new Circle("Blue", side1, side2, side3);
        System.out.println(circle);
        System.out.println(circle1);
    }
}
