package model.product.digitalproduct;

import model.product.Product;
import model.product.ProductCategory;

public abstract class Digital extends Product {
    private final int weight;
    private final int dimensions;

    public Digital(String productName, double productPrice, ProductCategory productCategory, int numOfInventory, double scoreAverage, int weight, int dimensions) {
        super(productName, productPrice, productCategory, numOfInventory, scoreAverage);
        this.weight = weight;
        this.dimensions = dimensions;
    }

    public int getWeight(){
        return weight;
    }
    public int getDimensions(){
        return dimensions;
    }
    @Override
    public String toString(){
        return super.toString() + " weight : " + weight + " dimensions : " + dimensions;
    }

}
