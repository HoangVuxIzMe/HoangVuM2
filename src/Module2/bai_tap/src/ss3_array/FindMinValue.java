package ss3_array;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        int n, min;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in the array: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element A[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));

        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print("Min value of array: " + min);
    }
}
