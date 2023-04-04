package model.product.stationaryproduct;

import model.product.Product;
import model.product.ProductCategory;

public abstract class Stationary extends Product {
    private final String country;

    public Stationary(String productName, double productPrice, ProductCategory productCategory, int numOfInventory, double scoreAverage, String country) {
        super(productName, productPrice, productCategory, numOfInventory, scoreAverage);
        this.country = country;
    }

    public String getCountry(){
        return country;
    }
    @Override
    public String toString(){
        return super.toString() + " producer country : " + country;
    }
}
