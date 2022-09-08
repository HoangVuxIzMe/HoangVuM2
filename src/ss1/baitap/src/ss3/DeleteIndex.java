package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteIndex {
    public static void main(String[] args) {
        int x, i, c;
        Scanner sc = new Scanner(System.in);
        int[] arrN = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Initial Array: \n" + Arrays.toString(arrN));
        System.out.print("Enter the number you want to delete: ");
        x = sc.nextInt();
        for (c = i = 0; i < arrN.length; i++) {
            if (arrN[i] != x) {
                arrN[c] = arrN[i];
                c++;
            }
        }
        System.out.println("Array after removing element " + x + " is: ");
        for (i = 0; i < c; i++) {
            System.out.print(arrN[i] + " ");
        }
        System.out.println("\nArray length: " + c);
    }
}
