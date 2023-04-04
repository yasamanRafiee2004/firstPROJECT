package model.product.stationaryproduct;

import model.product.ProductCategory;

public class Pen extends Stationary {
    String color;

    public Pen(String productName, double productPrice, ProductCategory productCategory, int numOfInventory, double scoreAverage, String country, String color) {
        super(productName, productPrice, productCategory, numOfInventory, scoreAverage, country);
        this.color = color;
    }

    @Override
    public String toString(){
        return super.toString() + " color : " + color;
    }
}
