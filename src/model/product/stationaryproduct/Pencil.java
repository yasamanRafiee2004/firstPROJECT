package model.product.stationaryproduct;

import model.product.ProductCategory;

public class Pencil extends Stationary {
    PencilCategory pencilCategory;

    public Pencil(String productName, int productPrice, ProductCategory productCategory, int numOfInventory, String country, PencilCategory pencilCategory) {
        super(productName, productPrice, productCategory, numOfInventory, country);
        this.pencilCategory = pencilCategory;
    }
}
