package demo_exam.controller;

import demo_exam.services.ServiceLessor;
import demo_exam.services.ServiceRenter;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    static boolean check = true;

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {

        while (check) {
            System.out.println("-------- MENU ACCOUNT REGISTER --------" +
                    "\n1. Menu nguoi cho thue" +
                    "\n2. Menu nguoi thue" +
                    "\n3. Exit");
            System.out.print("Nhap lua chon: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Khong phai so, vui long nhap lai");
            }
            switch (choice) {
                case 1:
                    displayRegisterLessor();
                    break;
                case 2:
                    displayRegisterRenter();
                    break;
                case 3:
                    System.out.println("Chuong trinh ket thuc");
                    check = false;
                    break;
            }
        }
    }

    public static void displayRegisterLessor() {
        ServiceLessor lessor = new ServiceLessor();
        while (check) {
            System.out.println("-------- REGISTER ACCOUNT LESSOR --------" +
                    "\n1. Dang ky nguoi dung" +
                    "\n2. Hien thi danh sach thong tin nguoi thue" +
                    "\n3. Hien thi nhung nguoi da thue nha thanh cong" +
                    "\n4. Quay lai menu chinh");
            System.out.print("Nhap lua chon: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai dinh dang, vui long nhap lai so!");
            }
            switch (choice) {
                case 1:
                    lessor.addAccount();
                    break;
                case 2:
                    lessor.display();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void displayRegisterRenter() {
        ServiceRenter renter = new ServiceRenter();

        while (check) {
            System.out.println("-------- REGISTER ACCOUNT RENTER --------" +
                    "\n1. Dang ky nguoi dung" +
                    "\n2. Hien thi danh sach thong tin nguoi cho thue" +
                    "\n3. Hien thi nhung nguoi da cho thue thanh cong" +
                    "\n4. Quay lai menu chinh");
            System.out.print("Nhap lua chon: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai dinh dang, vui long nhap lai so!");
            }
            switch (choice) {
                case 1:
                    renter.addAccount();
                    break;
                case 2:
                    renter.display();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }
}
