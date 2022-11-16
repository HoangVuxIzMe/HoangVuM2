package demo_exam.models;

import java.io.Serializable;

public class Account implements Serializable {
    private String idPersonal;
    private String fullName;
    private String date;
    private int gender;
    private boolean status = false;

    public Account() {
    }

    public Account(String idPersonal, String fullName, String date, int gender, boolean status) {
        this.idPersonal = idPersonal;
        this.fullName = fullName;
        this.date = date;
        this.gender = gender;
        this.status = status;
    }

    public String getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(String idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "idPersonal='" + idPersonal +
                ", fullName: " + fullName +
                ", date: " + date +
                ", gender: " + gender +
                ", status: " + status;
    }

    public String getInfo() {
        return getIdPersonal() + "," + getFullName() + "," + getDate() + "," + getGender() + "," + isStatus();
    }
}
