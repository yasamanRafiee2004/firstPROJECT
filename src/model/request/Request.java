package model.request;

import model.user.Customer;

public class Request {
    private Customer customer;
    private RequestType type;
    private Comment comment;
    private ChargeCredit chargeCredit;
    private static int helper = 1;
    private static int requestID;

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
    public ChargeCredit getChargeCredit(){
        return chargeCredit;
    }

}
