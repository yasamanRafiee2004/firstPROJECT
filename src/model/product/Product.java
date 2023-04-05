package model.product;

import model.request.Comment;

import java.util.ArrayList;

public abstract class Product {
    private StringBuilder productID;
    private String productName;
    private static int id = 1;
    private double productPrice;
    private final ProductCategory productCategory;
    private int numOfInventory;
    private final ArrayList<Comment> comments= new ArrayList<>();
    private double scoreAverage;
    private int counter;

    public Product(String productName, double productPrice, ProductCategory productCategory, int numOfInventory, double scoreAverage) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.numOfInventory = numOfInventory;
        this.scoreAverage = scoreAverage;
        this.counter=0;
        this.productID = IDMaker(productName);
        id++;
    }

    public StringBuilder IDMaker(String productName){
        StringBuilder ID = new StringBuilder();
        ID.append(productName);
        ID.append("-");
        ID.append(id);
        return ID;

    }
    public  ArrayList<Comment> getComments(){
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
    public void setInventory(int number){
        this.numOfInventory=number;
    }
    public int getCounter(){
        return counter;
    }
    public void setCounter(int counter1){
        counter = counter1;
    }
    public void setScoreAverage(double average){
        scoreAverage = average;
    }
    public void setProductID(String productName1){
        productID = IDMaker(productName1);
    }
    public String toString(){
        return "product ID : " + productID  +" product name : " + productName + " product price : " + productPrice + " product category : " + productCategory + " inventory number : " + numOfInventory +"score average :" + scoreAverage;
    }
}
