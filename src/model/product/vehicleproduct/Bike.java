package model.product.vehicleproduct;

import model.product.ProductCategory;

public class Bike extends Vehicle {
    BikeType bikeType;

    public Bike(String productName, int productPrice, ProductCategory productCategory, int numOfInventory, String companyName, BikeType bikeType) {
        super(productName, productPrice, productCategory, numOfInventory, companyName);
        this.bikeType = bikeType;
    }
   @Override
   public String toString(){
        return super.toString() + " bike type : " + bikeType;
   }
}
