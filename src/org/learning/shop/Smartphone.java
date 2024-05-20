package org.learning.shop;

import java.util.Random;

public class Smartphone extends Product {
    // Attributi
    private int imeiCode;

    private String storage;
    // Costruttore
    public Smartphone(String name,String desc, String price, String storage){
        super(name, desc, price);
        Random r = new Random();
        imeiCode = r.nextInt(10000);
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "SMARTPHONES" + " Name:" + name + " Desc:" + desc + " Price" + price + " Storage:" + storage + "IMEI Code:" + imeiCode;
    }
}
