package model.product;

import model.request.Comment;

import java.util.ArrayList;

public abstract class Product {
    private final StringBuilder productID;
    private String productName;
    private static int id = 1;
    private double productPrice;
    private ProductCategory productCategory;
    private int numOfInventory;
    private ArrayList<Comment> comments= new ArrayList<>();
    private double scoreAverage;

    public Product(String productName, double productPrice, ProductCategory productCategory, int numOfInventory, double scoreAverage) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.numOfInventory = numOfInventory;
        this.scoreAverage = scoreAverage;
        this.productID = IDMaker();
        id++;
    }

    public StringBuilder IDMaker(){
        StringBuilder ID = new StringBuilder();
        ID.append(productName);
        ID.append("-");
        ID.append(id);
        return ID;

    }
    public ArrayList<Comment> getComments(){
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
    public double getProductPrice(){
        return productPrice;
    }
    public int getNumOfInventory(){
        return numOfInventory;
    }
    public double getScoreAverage(){
        return scoreAverage;
    }
    public ProductCategory getProductCategory(){
        return productCategory;
    }
    public String toString(){
        return "product ID : " + productID  +" product name : " + productName + " product price : " + productPrice + " product category : " + productCategory + " inventory number : " + numOfInventory +"score average :" + scoreAverage;
    }
}
