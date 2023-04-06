package model.product.vehicleproduct;

import model.product.Product;
import model.product.ProductCategory;

public abstract class Vehicle extends Product {
    private final String companyName;

    public Vehicle(String productName, double productPrice, ProductCategory productCategory, int numOfInventory, double scoreAverage, String companyName) {
        super(productName, productPrice, productCategory, numOfInventory, scoreAverage);
        this.companyName = companyName;
    }

    @Override
    public String toString(){
        return super.toString() + " company name : " + companyName;
    }
}
