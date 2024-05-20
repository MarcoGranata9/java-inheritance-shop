package org.learning.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    // Argomenti
    private int code;
    protected String name;
    protected String desc;
    protected BigDecimal price;
    private int iva;

    // Costruttore
    public Product(String name,String desc, String price){
        code = generateCode();
        this.name = name;
        this.desc = desc;
        this.price = new BigDecimal(price);
        iva = 22;
    }

    // Metodi

    public BigDecimal getFullPrice() {
        BigDecimal div = new BigDecimal(100);
        BigDecimal mul = new BigDecimal(iva);

        BigDecimal fullPrice = price.divide(div, 2, RoundingMode.CEILING).multiply(mul).add(price);
        return fullPrice;
//        return price + ((price / 100) * iva);
    }

    private int generateCode() {
        Random rnd = new Random();
        return rnd.nextInt(999999);
    }

    public String getFullName() {
        return getCode() + "-" + name;
    }

    // Getters
    public String getCode() {
        return String.format("%06d", code);
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getIva() {
        return iva;
    }
    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrice(String price) {
        this.price = new BigDecimal(price);
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
}
