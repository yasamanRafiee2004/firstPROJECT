package model.product.vehicleproduct;

import model.product.Product;
import model.product.ProductCategory;

public class Vehicle extends Product {
    private final String companyName;

    public Vehicle(int productID, String productName, int productPrice, ProductCategory productCategory, String companyName) {
        super(productID, productName, productPrice, productCategory);
        this.companyName = companyName;
    }
    public String getCompanyName(){
        return companyName;
    }
}
