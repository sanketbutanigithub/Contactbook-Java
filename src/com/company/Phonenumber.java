package com.company;

public class Phonenumber {
    String lable;
    double phonnumber;

    public Phonenumber(String lable, double phonnumber) {
        this.lable = lable;
        this.phonnumber = phonnumber;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public double getPhonnumber() {
        return phonnumber;
    }

    public void setPhonnumber(double phonnumber) {
        this.phonnumber = phonnumber;
    }
}
