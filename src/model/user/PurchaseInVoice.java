package model.user;

import model.product.Product;

import java.util.ArrayList;

public class PurchaseInVoice {
    private final int productID;
    private final String date;
    private final int price;
    private ArrayList<Product> boughtProducts = new ArrayList<>();

    public PurchaseInVoice(int productID, String date, int price) {
        this.productID = productID;
        this.date = date;
        this.price = price;
    }

    public ArrayList<Product> getBoughtProducts() {
        return boughtProducts;
    }

    public int getProductID(){
        return productID;
    }
    public String getDate(){
        return date;
    }
    public int getPrice(){
        return price;
    }

}
