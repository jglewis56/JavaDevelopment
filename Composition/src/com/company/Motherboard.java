package com.company;

public class Motherboard {
    private String model;
    private String manufacure;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacure, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacure = manufacure;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName)
    {
        System.out.println("Program" + programName + "is running");
    }

    public String getModel() {
        return model;
    }

    public String getManufacure() {
        return manufacure;
    }


    public int getRamSlots() {
        return ramSlots;
    }


    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

}
