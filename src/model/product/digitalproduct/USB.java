package model.product.digitalproduct;

import model.product.ProductCategory;
import model.product.digitalproduct.InfoStorageEquipment;

public class USB extends InfoStorageEquipment {
     private final int version;

    public USB(int productID, String productName, int productPrice, ProductCategory productCategory, int weight, int dimensions, int capacity, int version) {
        super(productID, productName, productPrice, productCategory, weight, dimensions, capacity);
        this.version = version;
    }
    public int getVersion(){
        return version;
    }
}
