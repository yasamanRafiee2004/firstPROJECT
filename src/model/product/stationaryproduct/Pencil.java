package model.product.stationaryproduct;

import model.product.ProductCategory;

public class Pencil extends Stationary {
    PencilCategory pencilCategory;

    public Pencil(String productName, double productPrice, ProductCategory productCategory, int numOfInventory, double scoreAverage, String country, PencilCategory pencilCategory) {
        super(productName, productPrice, productCategory, numOfInventory, scoreAverage, country);
        this.pencilCategory = pencilCategory;
    }

    @Override
    public String toString(){
        return super.toString() + " pencil category : " + pencilCategory;
    }
}
