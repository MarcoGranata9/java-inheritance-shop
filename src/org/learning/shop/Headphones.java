package org.learning.shop;

public class Headphones extends Product{
    // Attributi
    private String color;
    private boolean wireless;
    // Costruttore
    public Headphones(String name, String desc, String price, String color, boolean wireless) {
        super(name, desc, price);
        this.color = color;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "HEADPHONES" + " Name:" + name + " Desc:" + desc + " Price" + price + " Color:" + color + "Wireless:" + wireless;
    }

}
