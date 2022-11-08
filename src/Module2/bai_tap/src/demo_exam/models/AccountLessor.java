package demo_exam.models;

public class AccountLessor extends Account{
    private float areaUse;
    private String addressRental;
    private int maxPerson;
    private int moneyRental;

    public AccountLessor() {
    }

    public AccountLessor(float areaUse, String addressRental, int maxPerson, int moneyRental) {
        this.areaUse = areaUse;
        this.addressRental = addressRental;
        this.maxPerson = maxPerson;
        this.moneyRental = moneyRental;
    }

    public AccountLessor(String idPersonal, String fullName, String date, int gender, boolean status, float areaUse, String addressRental, int maxPerson, int moneyRental) {
        super(idPersonal, fullName, date, gender, status);
        this.areaUse = areaUse;
        this.addressRental = addressRental;
        this.maxPerson = maxPerson;
        this.moneyRental = moneyRental;
    }

    public AccountLessor(String line) {
        String[] data = line.split(",");
        super.setIdPersonal(data[0]);
        super.setFullName(data[1]);
        super.setDate((data[2]));
        super.setGender(Integer.parseInt(data[3]));
        super.setStatus(Boolean.parseBoolean(data[4]));
        setAreaUse(Float.parseFloat(data[5]));
        setAddressRental(data[6]);
        setMaxPerson(Integer.parseInt(data[7]));
        setMoneyRental(Integer.parseInt(data[8]));
    }

    public float getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(float areaUse) {
        this.areaUse = areaUse;
    }

    public String getAddressRental() {
        return addressRental;
    }

    public void setAddressRental(String addressRental) {
        this.addressRental = addressRental;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public int getMoneyRental() {
        return moneyRental;
    }

    public void setMoneyRental(int moneyRental) {
        this.moneyRental = moneyRental;
    }

    @Override
    public String toString() {
        return "AccountLessor: " +
                super.toString() +
                ", Area Use=" + areaUse +
                ", Address Rental='" + addressRental + '\'' +
                ", Max Person=" + maxPerson +
                ", Money Rental=" + moneyRental +
                '.';
    }
    public String getInfo(){
        return super.getInfo() + getAreaUse() + "," + getAddressRental() + "," + getMaxPerson() + "," + getMoneyRental();
    }
}
