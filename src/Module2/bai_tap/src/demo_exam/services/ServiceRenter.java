package demo_exam.services;

import demo_exam.models.AccountRenter;
import demo_exam.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ServiceRenter implements ServiceAccount {
    List<AccountRenter> accountRenterList = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        ReadAndWrite.readFileRenter("D:\\Code_Module2\\HoangVuM2\\src\\Module2\\bai_tap\\src\\demo_exam\\data\\account_renter.txt");
        if (accountRenterList.size() == 0) {
            System.out.println("Mang rong");
        }
        for (AccountRenter accountRenter : accountRenterList) {
            System.out.println(accountRenter.toString());
        }
    }

    @Override
    public void addAccount() {
        System.out.println("-------- ACCOUNT RENTER --------");
        System.out.print("Nhap CCCD: ");
        String idPersonal = sc.nextLine();
        System.out.print("Nhap ho va ten: ");
        String fullName = sc.nextLine();
        System.out.print("Nhap ngay sinh(dd/MM/yyyy): ");
        String date = sc.nextLine();
        System.out.println("Nhap gioi tinh: " +
                "\n0. Nu" +
                "\n1. Nam");
        int gender = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap trang thai giao dich:" +
                "\n1. Chua giao dich" +
                "\n2. Da giao dich ");
        int optStatus = 0;
        try {
            optStatus = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhap sai, nhap chu so 1 or 2");
        }
        boolean status = false;
        switch (optStatus) {
            case 1:
                status = false;
                break;
            case 2:
                status = true;
        }

        System.out.print("Nhap dien tich nho nhat can thue: ");
        float minArea = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap dien tich lon nhat can thue: ");
        float maxArea = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap so tien nho nhat can thue: ");
        int minMoney = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so tien lon nhat can thue: ");
        int maxMoney = Integer.parseInt(sc.nextLine());

        System.out.println("\nThem nguoi cho thue thanh cong");

        AccountRenter accountRenter = new AccountRenter(idPersonal, fullName, date, gender, status, minArea, maxArea, minMoney, maxMoney);
        accountRenterList.add(accountRenter);
        ReadAndWrite.writeFileRenter(accountRenterList,"D:\\Code_Module2\\HoangVuM2\\src\\Module2\\bai_tap\\src\\demo_exam\\data\\account_renter.txt");
    }

    @Override
    public void deleteAccount() {

    }

    @Override
    public void search() {

    }
}
