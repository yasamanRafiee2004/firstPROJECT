package model.product.digitalproduct;

import model.product.ProductCategory;
import model.product.digitalproduct.Digital;

public class InfoStorageEquipment extends Digital {
    private final int capacity;

    public InfoStorageEquipment(int productID, String productName, int productPrice, ProductCategory productCategory, int weight, int dimensions, int capacity) {
        super(productID, productName, productPrice, productCategory, weight, dimensions);
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

}
