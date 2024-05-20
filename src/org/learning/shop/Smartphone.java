package org.learning.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

    @Override
    public BigDecimal getFidelityPrice() {
        BigDecimal div = new BigDecimal(100);
        BigDecimal mul = new BigDecimal(iva);
        BigDecimal fullPrice = price.divide(div, 2, RoundingMode.CEILING).multiply(mul).add(price);
        BigDecimal discount;
        if (Integer.parseInt(storage) > 32) {
            discount = fullPrice.multiply(new BigDecimal("0.02"));
        } else {
            discount = fullPrice.multiply(new BigDecimal("0.05"));
        }
        return fullPrice.subtract(discount);
    }
}
