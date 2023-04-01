package model.product.digitalproduct;

import model.product.Product;
import model.product.ProductCategory;

public abstract class Digital extends Product {
    private final int weight;
    private final int dimensions;

    public Digital(String productName, int productPrice, ProductCategory productCategory, int numOfInventory, int weight, int dimensions) {
        super(productName, productPrice, productCategory, numOfInventory);
        this.weight = weight;
        this.dimensions = dimensions;
    }

    public int getWeight(){
        return weight;
    }
    public int getDimensions(){
        return dimensions;
    }
}
