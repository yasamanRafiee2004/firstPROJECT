package model.product.digitalproduct;

import model.product.ProductCategory;
import model.product.digitalproduct.InfoStorageEquipment;

public class USB extends InfoStorageEquipment {
     private final int version;

    public USB(String productName, int productPrice, ProductCategory productCategory, int numOfInventory, int weight, int dimensions, int capacity, int version) {
        super(productName, productPrice, productCategory, numOfInventory, weight, dimensions, capacity);
        this.version = version;
    }

    public int getVersion(){
        return version;
    }
    public String toString(){
        return super.toString() + " version : " + version;
    }
}
