package model.request;

import model.user.Customer;

public class Comment {
   private final Customer customer;
   private final StringBuilder productID;
    private String text;
    private boolean bought;

    public Comment(Customer customer, StringBuilder productID, String text, boolean bought) {
        this.customer = customer;
        this.productID =productID;
        this.text = text;
        this.bought = bought;
    }
    public Customer getCustomer(){
        return customer;
    }
    public StringBuilder getProductID(){
        return productID;
    }
    public String getText(){
        return text;
    }
    public void setText(String text1){
        text = text1;
    }
    public String toString(){
        return "customer username: " + customer.getUserName() + " product ID : " + productID + " text : " + text ;
    }

}
