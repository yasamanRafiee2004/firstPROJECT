package model.user;

import model.product.Product;

import java.util.ArrayList;

public class Customer extends  User{
  private double creditBalance;
  private static ArrayList<PurchaseInVoice> purchases = new ArrayList<>();
  private static ArrayList<Product>  carts = new ArrayList<>();

    public Customer(String userName, String email, String phoneNumber, String password, double creditBalance) {
        super(userName, email, phoneNumber, password);
        this.creditBalance = 0;
    }
    public static ArrayList<PurchaseInVoice> getPurchases(){
        return purchases;
    }
    public static ArrayList<Product> getCarts(){
        return carts;
    }
    public double getCreditBalance(){
        return creditBalance;
    }
    public void setCreditBalance(int number){
        creditBalance = number;
    }
    @Override
    public String toString(){
        return super.toString() + " Balance ; " + creditBalance ;
    }
}
