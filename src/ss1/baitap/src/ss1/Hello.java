package ss1;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String a = sc.next();
        System.out.println("Hello " + a);
    }
}
