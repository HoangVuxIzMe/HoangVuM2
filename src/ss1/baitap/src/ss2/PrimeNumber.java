package ss2;

public class PrimeNumber {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        int n = 2;
        while (count < numbers) {
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
}
