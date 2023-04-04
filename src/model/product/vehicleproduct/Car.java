package model.product.vehicleproduct;

import model.product.ProductCategory;

public class Car extends Vehicle {
    private final int engineCapacity;
    Boolean automatic;

    public Car(String productName, double productPrice, ProductCategory productCategory, int numOfInventory, double scoreAverage, String companyName, int engineCapacity, Boolean automatic) {
        super(productName, productPrice, productCategory, numOfInventory, scoreAverage, companyName);
        this.engineCapacity = engineCapacity;
        this.automatic = automatic;
    }

    public int getEngineCapacity(){
        return engineCapacity;
    }
    @Override
    public String toString(){
        return super.toString() + " engine capacity : " + engineCapacity + "is the car automatic? " + automatic;
    }
}
