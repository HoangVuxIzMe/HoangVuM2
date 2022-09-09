package ss3;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        int n, m, max;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row (n) in the array: ");
        n = sc.nextInt();
        System.out.print("Enter the number of column (m) in the array: ");
        m = sc.nextInt();
        System.out.print("Array length: " + m * n);

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter your number in A[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(arr);

        max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max value in the array: " + max);
    }
}
