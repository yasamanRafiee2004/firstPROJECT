package model.product.stationaryproduct;

import model.product.ProductCategory;

public class Pencil extends Stationary {
    PencilCategory pencilCategory;

    public Pencil(int productID, String productName, int productPrice, ProductCategory productCategory, String country, PencilCategory pencilCategory) {
        super(productID, productName, productPrice, productCategory, country);
        this.pencilCategory = pencilCategory;
    }
}
