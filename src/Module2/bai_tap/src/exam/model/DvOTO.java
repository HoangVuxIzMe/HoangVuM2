package exam.model;

public class DvOTO extends OTo {
    private String soDangKy;
    private String tenChuXe;
    private String ngayDangKy;

    public DvOTO() {
    }

    public DvOTO(String soDangKy, String tenChuXe, String ngayDangKy) {
        this.soDangKy = soDangKy;
        this.tenChuXe = tenChuXe;
        this.ngayDangKy = ngayDangKy;
    }

    public DvOTO(String maPhuongTien, String tenPhuongTien, String hangSanXuat, int namSanXuat, int congSuat, int dungTich, int soChoNgoi, String loaiDongCo, String soDangKy, String tenChuXe, String ngayDangKy) {
        super(maPhuongTien, tenPhuongTien, hangSanXuat, namSanXuat, congSuat, dungTich, soChoNgoi, loaiDongCo);
        this.soDangKy = soDangKy;
        this.tenChuXe = tenChuXe;
        this.ngayDangKy = ngayDangKy;
    }

    public DvOTO(String line) {
        String[] data = line.split(",");
        setSoDangKy(data[0]);
        setNgayDangKy(data[1]);
        setNgayDangKy((data[2]));
    }

    public String getSoDangKy() {
        return soDangKy;
    }

    public void setSoDangKy(String soDangKy) {
        this.soDangKy = soDangKy;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(String ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    @Override
    public String toString() {
        return "DangKy{" +
                "soDangKy=" + soDangKy +
                ", tenChuXe='" + tenChuXe + '\'' +
                ", ngayDangKy='" + ngayDangKy + '\'' +
                super.toString() +
                '}';
    }

    public String getInfo() {
        return getSoDangKy() + ","+ getTenChuXe() + ","  + getNgayDangKy();
    }
}
