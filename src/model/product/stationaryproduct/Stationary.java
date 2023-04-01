package model.product.stationaryproduct;

import model.product.Product;
import model.product.ProductCategory;

public abstract class Stationary extends Product {
    private final String country;

    public Stationary(String productName, int productPrice, ProductCategory productCategory, int numOfInventory, String country) {
        super(productName, productPrice, productCategory, numOfInventory);
        this.country = country;
    }

    public String getCountry(){
        return country;
    }
}
