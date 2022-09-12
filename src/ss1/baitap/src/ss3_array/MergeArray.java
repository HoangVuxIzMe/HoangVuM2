package ss3_array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of element in the array 1: ");
        int n = sc.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter the number you wanna add in the array: ");
            array1[i] = sc.nextInt();
        }

        System.out.print("Enter the number of element in the array 2: ");
        int m = sc.nextInt();
        int[] array2 = new int[m];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter the number you wanna add in the array: ");
            array2[i] = sc.nextInt();
        }

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array3[array1.length + j] = array2[j];
        }
        System.out.print("Array 3: " + Arrays.toString(array3));
    }
}
