package controller;

import model.product.Product;
import model.user.Customer;

import java.util.ArrayList;

public class CustomerController {
    public static void addToCarts(Product product) {
        Customer.getCarts().add(product);
    }
    /*public static String viewPurchase(){

    }

     */
}
