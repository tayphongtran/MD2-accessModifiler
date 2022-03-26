package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehhicle v3 = new Vehhicle();
        Vehhicle v4 = new Vehhicle(50,10,"blue",560);
        System.out.println(v3);
        System.out.println(v4 + " chua co gi");
        v3.setColor("hight");
        v3.setMaxxSpeed(50);
        System.out.println(v3.getColor()+ " " + v3.getMaxxSpeed() + " duoc chua");
    }
}
