package ss2;

import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your shape you want to print: \n1. Rectangle \n2. Triangle \n3. Isosceles triangle");
        int inputNumber = sc.nextInt();
        if (inputNumber == 1) {
            System.out.println("Rectangle:");
            for (int i = 0; i < 3; i++) {
                System.out.println("* * * * * * *");
            }
        } else if (inputNumber == 2) {
            //Góc vuông dưới bên trái
            System.out.println("The corner is square bottom-left:");
            for (int i = 1; i <= 5; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            //Góc vuông dưới bên phải
            System.out.println("The corner is square bottom-right:");
            for (int i = 1; i <= 5; i++) {
                for (int j = 0; j <= 4; j++) {
                    if (j < 5 - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.print("\n");
            }
            //Góc vuông trên bên trái
            System.out.println("The corner is square top-left:");
            for (int i = 5; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            //Góc vuông trên bên phải
            System.out.println("The corner is square top-right:");
            for (int i = 0; i <= 5; i++) {
                for (int j = 0; j <= 4; j++) {
                    if (j >= i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
        } else if (inputNumber == 3) {
            System.out.println("Isosceles Triangle:");
            for (int i = 1; i <= 5; i++) {
                for (int j = 5; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }

    }
}
