package controller;

import model.product.Product;
import model.user.Customer;
import model.user.PurchaseInVoice;

public class CustomerController {
    public static void addToCarts(Product product, Customer customer) {
        customer.getCarts().add(product);
    }

    public static void removeCarts(String ID, Customer customer) {
        customer.getCarts().removeIf(a -> a.getProductID().toString().equals(ID));
    }


    public static int completeThePurchase(Customer customer) {
        double help = 0;
        for (Product a : customer.getCarts()) {
            help = help + a.getProductPrice();
            double balance = customer.getCreditBalance() - help;
            if (balance >= 0) {
                int inventory = a.getNumOfInventory() - 1;
                a.setInventory(inventory);
                customer.setCreditBalance(balance);
                PurchaseInVoice purchase = new PurchaseInVoice(a.getProductID(), "1401/1/22", a.getProductPrice());
                purchase.getBoughtProducts().add(a);
                customer.getPurchases().add(purchase);
                return 0;
            }
        }
        return 1;
    }

    public static Customer returningCustomer(String userName) {
        for (Customer a : AdminController.getCustomers()) {
            if (a.getUserName().equals(userName)) {
                return a;
            }
        }
        return null;
    }
}
