package exam.controller;

import exam.services.DangKyOTo;
import exam.services.DangKyXeTai;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    static boolean check = true;

    static int choice = 0;

    public static void main(String[] args) {
        hienThiMenuChinh();
    }

    public static void hienThiMenuChinh() {
        while (check) {
            System.out.println("1.Dang ky phuong tien" +
                    "\n2.Xem danh sach dang ky" +
                    "\n3.Huy dang ky" +
                    "\n4.Thoat");
            System.out.print("Nhap lua chon: ");
            //try-catch
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai dinh dang");
            }
            switch (choice){
                case 1:
                    dangKyXe();
                    break;
                case 2:
                    hienThiDs();
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Chuong trinh ket thuc");
                    check = false;
            }
        }
    }
    public static void dangKyXe(){
        DangKyOTo dangKyOTo = new DangKyOTo();
        DangKyXeTai dangKyXeTai = new DangKyXeTai();
        while (check){
            System.out.println("1. Dang ky Xe tai" +
                    "\n2. Dang ky o to" +
                    "\n3. Quay lai");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai dinh dang");
            }
            switch (choice){
                case 1:
                    dangKyXeTai.themMoi();
                    break;
                case 2:
                    dangKyOTo.themMoi();
                    break;
                case 3:
                    hienThiMenuChinh();
                    break;
            }
        }
    }
    public static void hienThiDs(){
        DangKyOTo dangKyOTo = new DangKyOTo();
        DangKyXeTai dangKyXeTai = new DangKyXeTai();
        while (check){
            System.out.println("1. Ds Dang ky Xe tai" +
                    "\n2. Ds dang ky o to" +
                    "\n3. Quay lai");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai dinh dang");
            }
            switch (choice){
                case 1:
                    dangKyXeTai.hienThi();
                    break;
                case 2:
                    dangKyOTo.hienThi();
                    break;
                case 3:
                    hienThiMenuChinh();
                    break;
            }
        }
    }
    public static void huyDangKy(){
        DangKyOTo dangKyOTo = new DangKyOTo();
        DangKyXeTai dangKyXeTai = new DangKyXeTai();
        while (check){
            System.out.println("1. Huy dang ky Xe tai" +
                    "\n2. Huy dang ky o to" +
                    "\n3. Quay lai");
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai dinh dang");
            }
            switch (choice){
                case 1:
                    dangKyXeTai.xoa();
                    break;
                case 2:
                    dangKyOTo.xoa();
                    break;
                case 3:
                    hienThiMenuChinh();
                    break;
            }
        }
    }
}
