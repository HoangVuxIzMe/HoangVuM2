package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class AddIndex {
    public static void main(String[] args) {
        int i, x, j;
        Scanner sc = new Scanner(System.in);
        int[] arrN = {10, 4, 6, 7, 8, 0, 0, 0, 0};
        System.out.println("Initial Array: " + Arrays.toString(arrN));
        System.out.print("Enter the position you wanna add: ");
        j = sc.nextInt();
        System.out.print("Enter the number you wanna add: ");
        x = sc.nextInt();
        System.out.println("Element " + x + " Position " + j);
        for (i = arrN.length - 1; i > j; i--) {
            arrN[i] = arrN[i - 1];
        }
        arrN[j] = x;
        System.out.println("Array after adding element " + x + " is: ");
        for (i = 0; i < arrN.length; i++) {
            System.out.print(arrN[i] + " ");
        }
    }
}
