package model.product.foodproduct;

import model.product.Product;
import model.product.ProductCategory;

public class Food extends Product {
    private final String productionDate;
    private final String expirationDate;

    public Food(int productID, String productName, int productPrice, ProductCategory productCategory, String productionDate, String expiration) {
        super(productID, productName, productPrice, productCategory);
        this.productionDate = productionDate;
        this.expirationDate = expiration;
    }
    public String getProductionDate(){
        return productionDate;
    }
    public String getExpirationDate(){
        return expirationDate;
    }
}
