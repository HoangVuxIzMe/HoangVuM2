package ss4_class.stop_watch;

public class RunWatch {
    // Hàm selectionSort Sắp xếp thứ tự trong mảng
    public void selectionSort(int arr[]) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
            display(arr);
        }
    }

    public void display(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            ;
        }
        System.out.println(" ]");
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 200);
        }
        RunWatch sort = new RunWatch();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        sort.selectionSort(arr);
        stopWatch.stop();
        System.out.println("Run time : "+stopWatch.getElapsedTime() + " millisecond.");
    }
}
