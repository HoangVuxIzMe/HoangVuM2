import java.util.Scanner;

public class USDtoVN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rate = 23000;
        System.out.print("Enter the amount your need to transfer from USD to VND: ");
        int usdMoney = sc.nextInt();
        System.out.print("Your money: " + (usdMoney*rate) + " VND");
    }
}
