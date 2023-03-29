package model.product.vehicleproduct;

import model.product.ProductCategory;

public class Bike extends Vehicle {
    BikeType bikeType;

    public Bike(int productID, String productName, int productPrice, ProductCategory productCategory, String companyName, BikeType bikeType) {
        super(productID, productName, productPrice, productCategory, companyName);
        this.bikeType = bikeType;
    }
}
