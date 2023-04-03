package model.user;

import model.product.Product;

import java.util.ArrayList;

public class Customer extends  User{
  private double creditBalance;
  private ArrayList<PurchaseInVoice> purchases = new ArrayList<>();
  private ArrayList<Product> carts = new ArrayList<>();

    public Customer(String userName, String email, String phoneNumber, String password, double creditBalance) {
        super(userName, email, phoneNumber, password);
        this.creditBalance = creditBalance;
    }
    public double getCreditBalance(){
        return creditBalance;
    }
    @Override
    public String toString(){
        return super.toString() + " Balance ; " + creditBalance ;
    }
}
