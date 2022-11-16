package exam.model;

public class XeTai extends PhuongTien {
    private int trongTai;

    public XeTai() {
    }

    public XeTai(int trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String maPhuongTien, String tenPhuongTien, String hangSanXuat, int namSanXuat, int congSuat, int dungTich, int trongTai) {
        super(maPhuongTien, tenPhuongTien, hangSanXuat, namSanXuat, congSuat, dungTich);
        this.trongTai = trongTai;
    }

    public XeTai(String line) {
        String[] data = line.split(",");
        super.setMaPhuongTien(data[0]);
        super.setTenPhuongTien(data[1]);
        super.setHangSanXuat((data[2]));
        super.setNamSanXuat(Integer.parseInt(data[3]));
        super.setCongSuat(Integer.parseInt(data[4]));
        super.setDungTich(Integer.parseInt(data[5]));
        setTrongTai(Integer.parseInt(data[6]));
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", trongTai=" + trongTai;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "," + getTrongTai();
    }
}
