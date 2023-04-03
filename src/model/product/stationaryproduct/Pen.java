package model.product.stationaryproduct;

import model.product.ProductCategory;

public class Pen extends Stationary {
    String color;

    public Pen(String productName, int productPrice, ProductCategory productCategory, int numOfInventory, String country, String color) {
        super(productName, productPrice, productCategory, numOfInventory, country);
        this.color = color;
    }
    @Override
    public String toString(){
        return super.toString() + " color : " + color;
    }
}
