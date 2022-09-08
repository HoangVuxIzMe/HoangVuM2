package ss1;

import java.util.Scanner;

public class NumberReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] donVi = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Night"};
        String[] chuc = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        System.out.print("Nhập số (0-999): ");
        int number = sc.nextInt();
        int hundreds = number / 100;
        int dozens = (number % 100) / 10;
        int units = (number % 100) % 10;
        System.out.println("Hàng trăm : " + hundreds + " Hàng chục: " + dozens + " Hàng đơn vị: " + units);

        if (hundreds >= 1) {
            System.out.println(donVi[hundreds] + " Hundred" + (dozens == 0 ? "" : (" And " + chuc[dozens - 1]))
                    + (units == 0 ? "" : (" " + donVi[units])));
        } else if (dozens >= 1) {
            System.out.println(chuc[dozens - 1] + (units == 0 ? "" : (" And " + donVi[units])));
        } else {
            System.out.println(donVi[units]);
        }
    }
}
