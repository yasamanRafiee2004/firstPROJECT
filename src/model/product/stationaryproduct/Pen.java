package model.product.stationaryproduct;

import model.product.ProductCategory;

public class Pen extends Stationary {
    String color;

    public Pen(int productID, String productName, int productPrice, ProductCategory productCategory, String country, String color) {
        super(productID, productName, productPrice, productCategory, country);
        this.color = color;
    }
}
