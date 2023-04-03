package model.product.vehicleproduct;

import model.product.Product;
import model.product.ProductCategory;

public abstract class Vehicle extends Product {
    private final String companyName;

    public Vehicle(String productName, int productPrice, ProductCategory productCategory, int numOfInventory, String companyName) {
        super(productName, productPrice, productCategory, numOfInventory);
        this.companyName = companyName;
    }

    public String getCompanyName(){
        return companyName;
    }
    @Override
    public String toString(){
        return super.toString() + " company name : " + companyName;
    }
}
