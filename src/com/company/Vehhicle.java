package com.company;

public class Vehhicle {
    int maxxSpeed, whlees;
    private String color;
    private double fuelcapacity;

    public Vehhicle() {
        this.color = "GREEN";
    }

    public Vehhicle(int maxxSpeed, int whlees, String color, double fuelcapacity) {
        this.maxxSpeed = maxxSpeed;
        this.whlees = whlees;
        this.color = color;
        this.fuelcapacity = fuelcapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxxSpeed() {
        return maxxSpeed;
    }

    public void setMaxxSpeed(int maxxSpeed) {
        this.maxxSpeed = maxxSpeed;
    }

    public int getWhlees() {
        return whlees;
    }

    public void setWhlees(int whlees) {
        this.whlees = whlees;
    }

    public double getFuelcapacity() {
        return fuelcapacity;
    }

    public void setFuelcapacity(double fuelcapacity) {
        this.fuelcapacity = fuelcapacity;
    }

    @Override
    public String toString() {
        return "Vehhicle{" +
                "maxxSpeed=" + maxxSpeed +
                ", whlees=" + whlees +
                ", color='" + color + '\'' +
                ", fuelcapacity=" + fuelcapacity +
                '}';
    }

    public static void main(String[] args) {
        Vehhicle v1 = new Vehhicle();
        v1.setColor("red");
        System.out.println(v1.getColor() + " roi");
        Vehhicle v2 = new Vehhicle();
        v2.setColor("green");
        System.out.println(v2.getColor() + " new");
    }
}
