package model.product.digitalproduct;

import model.product.ProductCategory;
import model.product.digitalproduct.Digital;

public class PersonalComputer extends Digital {
    private final String CPUModel;
    private final int RAMCapacity;

    public PersonalComputer(String productName, int productPrice, ProductCategory productCategory, int numOfInventory, int weight, int dimensions, String CPUModel, int RAMCapacity) {
        super(productName, productPrice, productCategory, numOfInventory, weight, dimensions);
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
