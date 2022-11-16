package exam.model;

public class OTo extends PhuongTien {
    private int soChoNgoi;
    private String loaiDongCo;

    public OTo() {
    }

    public OTo(int soChoNgoi, String loaiDongCo) {
        this.soChoNgoi = soChoNgoi;
        this.loaiDongCo = loaiDongCo;
    }

    public OTo(String maPhuongTien, String tenPhuongTien, String hangSanXuat, int namSanXuat, int congSuat, int dungTich, int soChoNgoi, String loaiDongCo) {
        super(maPhuongTien, tenPhuongTien, hangSanXuat, namSanXuat, congSuat, dungTich);
        this.soChoNgoi = soChoNgoi;
        this.loaiDongCo = loaiDongCo;
    }

    public OTo(String line) {
        String[] data = line.split(",");
        super.setMaPhuongTien(data[0]);
        super.setTenPhuongTien(data[1]);
        super.setHangSanXuat((data[2]));
        super.setNamSanXuat(Integer.parseInt(data[3]));
        super.setCongSuat(Integer.parseInt(data[4]));
        super.setDungTich(Integer.parseInt(data[5]));
        setSoChoNgoi(Integer.parseInt(data[6]));
        setLoaiDongCo(data[7]);
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getLoaiDongCo() {
        return loaiDongCo;
    }

    public void setLoaiDongCo(String loaiDongCo) {
        this.loaiDongCo = loaiDongCo;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", soChoNgoi=" + soChoNgoi +
                ", loaiDongCo='" + loaiDongCo + '\'';
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "," + getSoChoNgoi() + "," + getLoaiDongCo();
    }
}
