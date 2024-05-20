package org.learning.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

    @Override
    public BigDecimal getFidelityPrice() {
        BigDecimal div = new BigDecimal(100);
        BigDecimal mul = new BigDecimal(iva);
        BigDecimal fullPrice = price.divide(div, 2, RoundingMode.CEILING).multiply(mul).add(price);
        BigDecimal discount;
        if (wireless) {
            discount = fullPrice.multiply(new BigDecimal("0.02"));
        } else {
            discount = fullPrice.multiply(new BigDecimal("0.07"));
        }
        return fullPrice.subtract(discount);
    }
}
