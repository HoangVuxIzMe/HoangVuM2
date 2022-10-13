package ss14_sort_operator;

import java.util.Scanner;

public class SelectionSort {
    public static void selectSort(int[] list) {
        int minIndex;
        for (int i = 0; i < list.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
        System.out.print("\nMảng tăng dần(Selection Sort): ");
        for (int n : list) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử muốn có trong mảng: ");
        int n = sc.nextInt();
        int[] arrNum = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + ": ");
            int inpNum = sc.nextInt();
            arrNum[i] = inpNum;
        }

        System.out.print("\nMảng ban đầu: ");
        for (int k : arrNum){
            System.out.print(k + " ");
        }
        selectSort(arrNum);
    }
}
