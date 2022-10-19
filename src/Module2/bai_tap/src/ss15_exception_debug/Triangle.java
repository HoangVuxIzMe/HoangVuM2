package ss15_exception_debug;

import java.util.Scanner;

public class Triangle {
    public static void checkTriangleEdges(double a, double b, double c) throws TriangleEdgesException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleEdgesException("Error!! Error size triangle !!");
        } else {
            System.out.println("~~ Complete. ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        try {
            System.out.print("Enter a = ");
            a = sc.nextDouble();
            System.out.print("Enter b = ");
            b = sc.nextDouble();
            System.out.print("Enter c = ");
            c = sc.nextDouble();
            try {
                checkTriangleEdges(a, b, c);
            } catch (TriangleEdgesException exception) {
                System.out.println("Lỗi: " + exception.getMessage());
            }

        } catch (Exception exception) {
            System.out.print("Lỗi: Không đúng định dạng");
        }
    }
}
