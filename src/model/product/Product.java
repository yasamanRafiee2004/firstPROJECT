package model.product;

public class Product {
    private final int productID;
    private final String productName;
    private final int productPrice;
     ProductCategory productCategory;

    public Product(int productID, String productName, int productPrice, ProductCategory productCategory) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }
    public int getProductID(){
        return productID;
    }
    public String getProductName(){
        return productName;
    }
    public int getProductPrice(){
        return productPrice;
    }
}
