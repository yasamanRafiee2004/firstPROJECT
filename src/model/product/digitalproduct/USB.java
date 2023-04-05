package model.product.digitalproduct;

import model.product.ProductCategory;


public class USB extends InfoStorageEquipment {
     private final int version;

    public USB(String productName, double productPrice, ProductCategory productCategory, int numOfInventory, double scoreAverage, int weight, int dimensions, int capacity, int version) {
        super(productName, productPrice, productCategory, numOfInventory, scoreAverage, weight, dimensions, capacity);
        this.version = version;
    }
    public String toString(){
        return super.toString() + " version : " + version;
    }
}
