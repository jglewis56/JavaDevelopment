package com.company;

public class Main {

    public static void main(String[] args) {
        Dimension dimension = new Dimension(20,20,5);
	    Case myCase = new Case("22b","Dell","240", dimension);
        Monitor monitor = new Monitor("27inBeaset", "Acer", 27, new Resolution(2540, 1400));
        Motherboard motherboard = new Motherboard("BJx", "Asus",7,8,"v2.45");
        PC myPC = new PC(myCase,monitor,motherboard);

    }
}
