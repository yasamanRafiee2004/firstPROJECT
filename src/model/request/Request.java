package model.request;

import model.user.Customer;

public class Request {
    private Customer customer;
    private RequestType type;
    private Comment comment;
    private double chargeCredit;
    private static int helper = 1;
    private int requestID;

    public Request(Customer customer, RequestType type) {
        this.customer = customer;
        this.type = type;
        requestID = helper;
        helper++;
    }
    public int getRequestID(){
        return requestID;
    }

    public Customer getCustomer(){
        return customer;
    }
    public RequestType getType(){
        return type;
    }
    public Comment getComment(){
        return comment;
    }
    public double getChargeCredit(){
        return chargeCredit;
    }
    public void setChargeCredit(double money){
        chargeCredit = money;
    }
    public void setComment(Comment comment1){
        comment = comment1;
    }

}
