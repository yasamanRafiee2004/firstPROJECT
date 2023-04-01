package model.product;

public abstract class Product {
    private final StringBuilder productID;
    private String productName;
    private static int id = 1;
    private int productPrice;
    ProductCategory productCategory;
    private int numOfInventory;

    public Product( String productName, int productPrice, ProductCategory productCategory, int numOfInventory) {
        this.productID =IDMaker() ;
        id++;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.numOfInventory = numOfInventory;
    }
    public StringBuilder IDMaker(){
        StringBuilder ID = new StringBuilder();
        ID.append(productName);
        ID.append("-");
        ID.append(id);
        return ID;

    }
    public StringBuilder getProductID(){
        return productID;
    }
    public void setProductName(String name){
        this.productName = name;
    }
    public void setProductPrice(int price){
        this.productPrice = price;
    }
    public void setNumOfInventory(int inventory){
        this.numOfInventory = inventory;
    }
    public String getProductName(){
        return productName;
    }
    public int getProductPrice(){
        return productPrice;
    }
    public int getNumOfInventory(){
        return numOfInventory;
    }
}
