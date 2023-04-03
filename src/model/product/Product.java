package model.product;

import model.request.Comment;

import java.util.ArrayList;

public abstract class Product {
    private final StringBuilder productID;
    private String productName;
    private static int id = 1;
    private int productPrice;
    ProductCategory productCategory;
    private int numOfInventory;
    private static ArrayList<Comment> comments= new ArrayList<>();

    public Product( String productName, int productPrice, ProductCategory productCategory, int numOfInventory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.numOfInventory = numOfInventory;
        this.productID =IDMaker() ;
        id++;
    }
    public StringBuilder IDMaker(){
        StringBuilder ID = new StringBuilder();
        ID.append(productName);
        ID.append("-");
        ID.append(id);
        return ID;

    }
    public static ArrayList<Comment> getComments(){
        return comments;
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
    public String toString(){
        return "product ID : " + productID  +" product name : " + productName + " product price : " + productPrice + " product category : " + productCategory + " inventory number : " + numOfInventory;
    }
}
