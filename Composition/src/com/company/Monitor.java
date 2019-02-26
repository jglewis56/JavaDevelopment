package com.company;

public class Monitor {
    private String model;
    private String manufacure;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacure, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacure = manufacure;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x +" " + y + " in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacure() {
        return manufacure;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
