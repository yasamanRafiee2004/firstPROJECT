package model.product.vehicleproduct;

import model.product.ProductCategory;

public class Car extends Vehicle {
    private final int engineCapacity;
    Boolean automatic;

    public Car(String productName, int productPrice, ProductCategory productCategory, int numOfInventory, String companyName, int engineCapacity, Boolean automatic) {
        super(productName, productPrice, productCategory, numOfInventory, companyName);
        this.engineCapacity = engineCapacity;
        this.automatic = automatic;
    }

    public int getEngineCapacity(){
        return engineCapacity;
    }
}
