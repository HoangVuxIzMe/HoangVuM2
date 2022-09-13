package ss4_class;

import java.util.Scanner;

public class SumOfArray {
    public static int sumOfArray(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Tổng dãy số của mảng: " + sumOfArray(arr));
    }
}
