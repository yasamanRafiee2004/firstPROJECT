package model.product.digitalproduct;

import model.product.ProductCategory;
import model.product.digitalproduct.Digital;

public class PersonalComputer extends Digital {
    private final String CPUModel;
    private final int RAMCapacity;

    public PersonalComputer(String productName, double productPrice, ProductCategory productCategory, int numOfInventory, double scoreAverage, int weight, int dimensions, String CPUModel, int RAMCapacity) {
        super(productName, productPrice, productCategory, numOfInventory, scoreAverage, weight, dimensions);
        this.CPUModel = CPUModel;
        this.RAMCapacity = RAMCapacity;
    }

    public String getCPUModel(){
        return CPUModel;
    }
    public int getRAMCapacity(){
        return RAMCapacity;
    }
    @Override
    public String toString(){
        return super.toString() + " CPU model : " + CPUModel + "RAM model : " + RAMCapacity;
    }
}
