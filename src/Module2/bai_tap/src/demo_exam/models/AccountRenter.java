package demo_exam.models;

public class AccountRenter extends Account {
    private float minArea;
    private float maxArea;
    private int minMoney;
    private int maxMoney;

    public AccountRenter() {
    }

    public AccountRenter(float minArea, float maxArea, int minMoney, int maxMoney) {
        this.minArea = minArea;
        this.maxArea = maxArea;
        this.minMoney = minMoney;
        this.maxMoney = maxMoney;
    }

    public AccountRenter(String idPersonal, String fullName, String date, int gender, boolean status, float minArea, float maxArea, int minMoney, int maxMoney) {
        super(idPersonal, fullName, date, gender, status);
        this.minArea = minArea;
        this.maxArea = maxArea;
        this.minMoney = minMoney;
        this.maxMoney = maxMoney;
    }

    public AccountRenter(String line) {
        String[] data = line.split(",");
        super.setIdPersonal(data[0]);
        super.setFullName(data[1]);
        super.setDate((data[2]));
        super.setGender(Integer.parseInt(data[3]));
        super.setStatus(Boolean.parseBoolean(data[4]));
        setMinArea(Float.parseFloat(data[5]));
        setMaxArea(Float.parseFloat(data[6]));
        setMinMoney(Integer.parseInt(data[7]));
        setMaxMoney(Integer.parseInt(data[8]));
    }

    public float getMinArea() {
        return minArea;
    }

    public void setMinArea(float minArea) {
        this.minArea = minArea;
    }

    public float getMaxArea() {
        return maxArea;
    }

    public void setMaxArea(float maxArea) {
        this.maxArea = maxArea;
    }

    public int getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(int minMoney) {
        this.minMoney = minMoney;
    }

    public int getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(int maxMoney) {
        this.maxMoney = maxMoney;
    }

    @Override
    public String toString() {
        return "AccountRenter: " +
                super.toString() +
                ", Min Area=" + minArea +
                ", Max Area=" + maxArea +
                ", Min Money=" + minMoney +
                ", Max Money=" + maxMoney +
                '.';
    }

    public String getInfo() {
        return super.getInfo() + getMinArea() + "," + getMaxArea() + "," + getMinMoney() + "," + getMaxMoney();
    }
}
