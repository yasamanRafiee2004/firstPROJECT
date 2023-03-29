package model.product.digitalproduct;

import model.product.Product;
import model.product.ProductCategory;

public class Digital extends Product {
    private final int weight;
    private final int dimensions;

    public Digital(int productID, String productName, int productPrice, ProductCategory productCategory, int weight, int dimensions) {
        super(productID, productName, productPrice, productCategory);
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
