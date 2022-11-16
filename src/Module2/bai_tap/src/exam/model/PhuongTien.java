package exam.model;

public abstract class PhuongTien {
    private String maPhuongTien;
    private String tenPhuongTien;
    private String hangSanXuat;
    private int namSanXuat;
    private int congSuat;
    private int dungTich;

    public PhuongTien() {
    }

    public PhuongTien(String maPhuongTien, String tenPhuongTien, String hangSanXuat, int namSanXuat, int congSuat, int dungTich) {
        this.maPhuongTien = maPhuongTien;
        this.tenPhuongTien = tenPhuongTien;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.congSuat = congSuat;
        this.dungTich = dungTich;
    }

    public String getMaPhuongTien() {
        return maPhuongTien;
    }

    public void setMaPhuongTien(String maPhuongTien) {
        this.maPhuongTien = maPhuongTien;
    }

    public String getTenPhuongTien() {
        return tenPhuongTien;
    }

    public void setTenPhuongTien(String tenPhuongTien) {
        this.tenPhuongTien = tenPhuongTien;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    @Override
    public String toString() {
        return ", maPhuongTien='" + maPhuongTien + '\'' +
                ", tenPhuongTien='" + tenPhuongTien + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", congSuat=" + congSuat +
                ", dungTich=" + dungTich;
    }

    public String getInfo() {
        return getMaPhuongTien() + "," + getTenPhuongTien() + "," + getHangSanXuat() + "," + getNamSanXuat() + "," + getCongSuat() + "," + getDungTich();
    }
}
