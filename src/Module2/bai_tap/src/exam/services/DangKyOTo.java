package exam.services;

import exam.model.DvOTO;
import exam.utils.ReadAndWrite;
import exam.utils.RegexData;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DangKyOTo implements phucVu {
    private static Scanner sc = new Scanner(System.in);
    private static List<DvOTO> oToList = new LinkedList<>();
    final static String REGEX_SODANGKY = "^(Y[0-9]{1}-[0-9]{4})$";
    final static String REGEX_NGAY = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";
    final static String REGEX_TEN = "^([a-z]+)((\\s{1}[a-z]+){1,})$";

    @Override
    public void themMoi() {
        System.out.print("Nhap so dang ky: ");
        String soDangKy = RegexData.regexStr(sc.nextLine(), REGEX_SODANGKY, "Sai dinh dang, dinh dang dung Yx-xxxx(x tu 0-9)");
        System.out.print("Nhap Ten: ");
        String tenChuXe = RegexData.regexStr(sc.nextLine(), REGEX_TEN, "Ten phai it nhat 2 tu");
        System.out.print("Nhap ngay dang ky: ");
        String ngayDangKy = RegexData.regexStr(sc.nextLine(), REGEX_NGAY, "Sai dinh dang, dinh dang dung dd/MM/yyyy");
        DvOTO oto = new DvOTO(soDangKy, tenChuXe, ngayDangKy);
        oToList.add(oto);
        ReadAndWrite.writeFileOto(oToList, "D:\\Code_Module2\\HoangVuM2\\src\\Module2\\bai_tap\\src\\exam\\data\\data\\gdkpt.csv");
    }

    @Override
    public void hienThi() {
        ReadAndWrite.readFileOto("D:\\Code_Module2\\HoangVuM2\\src\\Module2\\bai_tap\\src\\exam\\data\\data\\gdkpt.csv");
        ReadAndWrite.readFileMaOto("D:\\Code_Module2\\HoangVuM2\\src\\Module2\\bai_tap\\src\\exam\\data\\phuongTien.csv");

        for (DvOTO oto : oToList) {
            System.out.println(oto.toString());
        }
    }

    @Override
    public void xoa() {
    }
}
