package model.user;

import model.product.Product;

import java.util.ArrayList;

public class PurchaseInVoice {
    private final int puchaseID;
    private static int id = 1;
    private final String date;
    private final int price;
    private ArrayList<Product> boughtProducts = new ArrayList<>();

    public PurchaseInVoice(int productID, String date, int price) {
        this.puchaseID = id;
        id++;
        this.date = date;
        this.price = price;
    }

    public ArrayList<Product> getBoughtProducts() {
        return boughtProducts;
    }

    public int getProductID(){
        return puchaseID;
    }
    public String getDate(){
        return date;
    }
    public int getPrice(){
        return price;
    }
    public  String toString(){
        return "shopping date : " + date + " price : " +price;
    }

}
