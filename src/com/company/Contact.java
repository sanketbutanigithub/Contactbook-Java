package com.company;

import java.util.List;

public class Contact {
    String name;
    String organization;
    List<Phonenumber> phonenumber;
    List<Address> addresses;

    public Contact(String name, String organization, List<Phonenumber> phonenumber, List<Address> addresses) {
        this.name = name;
        this.organization = organization;
        this.phonenumber = phonenumber;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public List<Phonenumber> getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(List<Phonenumber> phonenumber) {
        this.phonenumber = phonenumber;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
