package model.product.foodproduct;

import model.product.Product;
import model.product.ProductCategory;

public class Food extends Product {
    private final String productionDate;
    private final String expirationDate;

    public Food(String productName, double productPrice, ProductCategory productCategory, int numOfInventory, double scoreAverage, String productionDate, String expirationDate) {
        super(productName, productPrice, productCategory, numOfInventory, scoreAverage);
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
    }

    public String getProductionDate(){
        return productionDate;
    }
    public String getExpirationDate(){
        return expirationDate;
    }
    @Override
    public String toString(){
        return  super.toString() + " production date : " + productionDate + " expiration date : " + expirationDate;
    }
}
