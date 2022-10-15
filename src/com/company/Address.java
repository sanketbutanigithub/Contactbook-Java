package com.company;

public class Address {
    String label;
    String address;

    public Address(String label, String address) {
        this.label = label;
        this.address = address;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
