package ss14_sort_operator;

public class InsertionSort {
    public static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                //Đổi dấu > nếu muốn mảng giảm dần
                if (a[j] < a[j - 1]) {
                    System.out.println("\nGiá trị phần tử " + a[j] + " < " + a[j - 1]);
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    System.out.println("Hoán đổi vị trí của " + a[j] + " cho " + a[j - 1]);
                    System.out.print("Mảng sau khi chèn: ");
                    for (int n : a) {
                        System.out.print(n + " ");
                    }
                    System.out.println();
                } else {
                    break;
                }
            }
        }
        System.out.print("\nMảng tăng dần (Insert Sort): ");
        for (int n : a) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int[] arrNum = {9, 2, 7, 8, 2, 4, 0};
        System.out.print("Mảng ban đầu là: { ");
        for (int n : arrNum){
            System.out.print(n + " ");
        }
        System.out.println("}");

        insertSort(arrNum);
    }
}
