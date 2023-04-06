package model.product.vehicleproduct;

import model.product.ProductCategory;

public class Bike extends Vehicle {
   private BikeType bikeType;

    public Bike(String productName, double productPrice, ProductCategory productCategory, int numOfInventory, double scoreAverage, String companyName, BikeType bikeType) {
        super(productName, productPrice, productCategory, numOfInventory, scoreAverage, companyName);
        this.bikeType = bikeType;
    }
    public BikeType getBikeType(){
        return bikeType;
    }

    @Override
   public String toString(){
        return super.toString() + " bike type : " + bikeType;
   }
}
