package model.product.digitalproduct;

import model.product.ProductCategory;
import model.product.digitalproduct.Digital;

public class PersonalComputer extends Digital {
    private final String CPUModel;
    private final int RAMCapacity;

    public PersonalComputer(int productID, String productName, int productPrice, ProductCategory productCategory, int weight, int dimensions, String CPUModel, int RAMCapacity) {
        super(productID, productName, productPrice, productCategory, weight, dimensions);
        this.CPUModel = CPUModel;
        this.RAMCapacity = RAMCapacity;
    }
    public String getCPUModel(){
        return CPUModel;
    }
    public int getRAMCapacity(){
        return RAMCapacity;
    }
}
