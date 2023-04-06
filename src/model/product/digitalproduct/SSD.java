package model.product.digitalproduct;

import model.product.ProductCategory;

public class SSD extends InfoStorageEquipment {
    private final double readingSpeed;
    private final double writingSpeed;

    public SSD(String productName, double productPrice, ProductCategory productCategory, int numOfInventory, double scoreAverage, int weight, int dimensions, int capacity, double readingSpeed, double writingSpeed) {
        super(productName, productPrice, productCategory, numOfInventory, scoreAverage, weight, dimensions, capacity);
        this.readingSpeed = readingSpeed;
        this.writingSpeed = writingSpeed;
    }

    public double getReadingSpeed(){
        return readingSpeed;
    }
    public double getWritingSpeed(){
        return writingSpeed;
    }
    @Override
    public String toString(){
        return super.toString() + " reading speed : " + readingSpeed + " writing speed : " + writingSpeed;
    }
}
