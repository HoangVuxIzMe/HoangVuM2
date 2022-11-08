package demo_exam.services;

import demo_exam.models.AccountLessor;
import demo_exam.utils.ReadAndWrite;
import demo_exam.utils.RegexData;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ServiceLessor implements ServiceAccount {
    Scanner sc = new Scanner(System.in);
    List<AccountLessor> accountLessorList = new LinkedList<>();
    final static String REGEX_CCCD = "^([0-9]{12})$";

    @Override
    public void display() {
        ReadAndWrite.readFileLessor("D:\\Code_Module2\\HoangVuM2\\src\\Module2\\bai_tap\\src\\demo_exam\\data\\account_lessor.txt");
//        if (accountLessorList.size() == 0){
//            System.out.println("Mang rong");
//        }
        for (AccountLessor accountLessor : accountLessorList){
            System.out.println(accountLessor.toString());
        }
    }

    @Override
    public void addAccount() {
        System.out.println("-------- ACCOUNT LESSOR --------");

        String idPersonal = inputCccd();
        while (checkExistCccd(idPersonal)) {
            System.out.println("CCCD trùng! Vui lòng nhập lại.");
            System.out.println("Nhập CCCD: ");
            idPersonal = sc.nextLine();
        }

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

        System.out.print("Nhap dien tich cho thue: ");
        float areaUse = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap dia chi nha cho thue: ");
        String addressRental = sc.nextLine();
        System.out.print("Nhap so nguoi 1 phong: ");
        int maxPerson = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gia tien phong: ");
        int moneyRental = Integer.parseInt(sc.nextLine());

        System.out.println("\nThem nguoi thue thanh cong");

        AccountLessor accountLessor = new AccountLessor(idPersonal,fullName,date,gender,status,areaUse,addressRental,maxPerson,moneyRental);
        accountLessorList.add(accountLessor);
        ReadAndWrite.writeFileLessor(accountLessorList,"D:\\Code_Module2\\HoangVuM2\\src\\Module2\\bai_tap\\src\\demo_exam\\data\\account_lessor.txt");

    }



    @Override
    public void deleteAccount() {

    }

    @Override
    public void search() {

    }
    public String inputCccd() {
        System.out.print("Nhập CCCD: ");
        return RegexData.regexStr(sc.nextLine(), REGEX_CCCD, "CCCD không đúng định dạng!, vui lòng nhập lại");
    }

    //check trùng cccd
    public boolean checkExistCccd(String input) {
        for (AccountLessor acc : accountLessorList) {
            if (input.equals(acc.getIdPersonal())) {
                return true;
            }
        }
        return false;
    }
}
