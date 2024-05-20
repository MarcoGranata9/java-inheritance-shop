package org.learning.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Television extends Product{
    // Attributi
    private int height;
    private int width;
    protected boolean smart;

    public Television(String name, String desc, String price, int height, int width, boolean smart) {
        super(name, desc, price);
        this.height = height;
        this.width = width;
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "TELEVISION" + " Name:" + name + " Desc:" + desc + " Price" + price + " Height:" + height + " Width" + width + " Smart" + smart;
    }

    @Override
    public BigDecimal getFidelityPrice() {
        BigDecimal div = new BigDecimal(100);
        BigDecimal mul = new BigDecimal(iva);
        BigDecimal fullPrice = price.divide(div, 2, RoundingMode.CEILING).multiply(mul).add(price);
        BigDecimal discount;
        if (smart) {
            discount = fullPrice.multiply(new BigDecimal("0.02"));
        } else {
            discount = fullPrice.multiply(new BigDecimal("0.10"));
        }
        return fullPrice.subtract(discount);
    }
}
