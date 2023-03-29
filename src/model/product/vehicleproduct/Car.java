package model.product.vehicleproduct;

import model.product.ProductCategory;

public class Car extends Vehicle {
    private final int engineCapacity;
    Boolean automatic;

    public Car(int productID, String productName, int productPrice, ProductCategory productCategory, String companyName, int engineCapacity, Boolean automatic) {
        super(productID, productName, productPrice, productCategory, companyName);
        this.engineCapacity = engineCapacity;
        this.automatic = automatic;
    }
    public int getEngineCapacity(){
        return engineCapacity;
    }
}
