package model.product.digitalproduct;

import model.product.ProductCategory;
import model.product.digitalproduct.Digital;

public abstract class InfoStorageEquipment extends Digital {
    private final int capacity;

    public InfoStorageEquipment(String productName, double productPrice, ProductCategory productCategory, int numOfInventory, double scoreAverage, int weight, int dimensions, int capacity) {
        super(productName, productPrice, productCategory, numOfInventory, scoreAverage, weight, dimensions);
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }
    @Override
    public String toString(){
        return super.toString() + " capacity : " + capacity;
    }

}
