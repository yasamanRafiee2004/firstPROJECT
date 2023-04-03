package model.request;

import model.user.Customer;

public class ChargeCredit extends Request {
    long cardNumber;
    int CVV2;
    int password;

    public ChargeCredit(Customer customer, RequestType type, long cardNumber, int CVV2, int password) {
        super(customer, type);
        this.cardNumber = cardNumber;
        this.CVV2 = CVV2;
        this.password = password;
    }
    @Override
    public String toString(){
        return super.toString() + "card number : " + cardNumber + " CVV2 : " + CVV2 ;
    }
}
