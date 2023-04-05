package model.user;

import model.product.Product;

import java.util.ArrayList;

public class PurchaseInVoice {
    private final StringBuilder puchaseID ;
    private final String date;
    private final double price;
    private final ArrayList<Product> boughtProducts = new ArrayList<>();

    public PurchaseInVoice(StringBuilder productID, String date, double price) {
        this.puchaseID = productID;
        this.date = date;
        this.price = price;
    }

    public  ArrayList<Product> getBoughtProducts() {
        return boughtProducts;
    }

    public StringBuilder getProductID(){
        return puchaseID;
    }
    public String getDate(){
        return date;
    }
    public double getPrice(){
        return price;
    }
    public  String toString(){
        return "product Info:" +getBoughtProducts().toString()+"shopping date : " + date + "purchase ID :" +puchaseID;
    }
}
