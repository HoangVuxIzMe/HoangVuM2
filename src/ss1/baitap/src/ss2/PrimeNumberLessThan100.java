package ss2;

public class PrimeNumberLessThan100 {
    public static void main(String[] args) {
        int n = 2;
        while (n < 100) {
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(n + " ");
            }
            n++;
        }
    }
}
