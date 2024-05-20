package org.learning.shop;

public class Televison extends Product{
    // Attributi
    private int height;
    private int width;
    protected boolean smart;

    public Televison(String name,String desc, String price, int height, int width,boolean smart) {
        super(name, desc, price);
        this.height = height;
        this.width = width;
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Nome:" + name + " Desc:" + desc + " price" + price + " Height:" + height + " Width" + width + " Smart" + smart;
    }

}
