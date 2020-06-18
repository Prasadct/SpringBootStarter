package com.prasadct.spd.spd.model;

public class Home {
    String name;
    String address;

    public Home(){

    }

    public Home(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Home{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
