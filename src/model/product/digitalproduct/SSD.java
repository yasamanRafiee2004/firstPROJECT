package model.product.digitalproduct;

import model.product.ProductCategory;
import model.product.digitalproduct.InfoStorageEquipment;

public class SSD extends InfoStorageEquipment {
    private final double readingSpeed;
    private final double writingSpeed;

    public SSD(int productID, String productName, int productPrice, ProductCategory productCategory, int weight, int dimensions, int capacity, double readingSpeed, double writingSpeed) {
        super(productID, productName, productPrice, productCategory, weight, dimensions, capacity);
        this.readingSpeed = readingSpeed;
        this.writingSpeed = writingSpeed;
    }
    public double getReadingSpeed(){
        return readingSpeed;
    }
    public double getWritingSpeed(){
        return writingSpeed;
    }
}
