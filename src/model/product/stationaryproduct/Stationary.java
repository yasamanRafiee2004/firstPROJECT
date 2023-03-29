package model.product.stationaryproduct;

import model.product.Product;
import model.product.ProductCategory;

public class Stationary extends Product {
    private final String country;

    public Stationary(int productID, String productName, int productPrice, ProductCategory productCategory, String country) {
        super(productID, productName, productPrice, productCategory);
        this.country = country;
    }
    public String getCountry(){
        return country;
    }
}
