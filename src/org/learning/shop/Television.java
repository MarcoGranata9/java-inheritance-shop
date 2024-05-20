package org.learning.shop;

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

}
