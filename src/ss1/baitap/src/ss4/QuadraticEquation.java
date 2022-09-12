package ss4;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(double a) {
        return a;
    }

    public double getB(double b) {
        return b;
    }

    public double getC(double c) {
        return c;
    }

    public double getDiscriminant(double a, double b, double c) {
        double delta = b * b - 4 * (a * c);
        return delta;
    }

    public double getRoot1(double a, double b, double c) {
        double numerator = -b + Math.sqrt(getDiscriminant(a, b, c));
        double denominator = 2 * a;
        double root1 = numerator / denominator;
        return root1;
    }

    public double getUnique(double a, double b, double c) {
        double unique = -b / (2 * a);
        return unique;
    }

    public double getRoot2(double a, double b, double c) {
        double numerator = -b - Math.sqrt(getDiscriminant(a, b, c));
        double denominator = 2 * a;
        double root2 = numerator / denominator;
        return root2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for a = ");
        double a = sc.nextDouble();
        System.out.print("Enter a number for b = ");
        double b = sc.nextDouble();
        System.out.print("Enter a number for c = ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation1 = new QuadraticEquation(a, b, c);
        double delta1 = quadraticEquation1.getDiscriminant(a, b, c);
        double root1 = quadraticEquation1.getRoot1(a, b, c);
        double root2 = quadraticEquation1.getRoot2(a, b, c);
        double unique = quadraticEquation1.getUnique(a, b, c);
        if (delta1 > 0 && a != 0) {
            System.out.println("Pt co 2 nghiem: \n Nghiem" + root1 + "\n" + root2);
        } else if (delta1 == 0 && a != 0) {
            System.out.println("Pt co 1 nghiem: " + unique);
        } else {
            System.out.println("Khong co nghiem");
        }
    }
}
