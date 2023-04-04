package controller;

import model.product.Product;
import model.product.ProductCategory;
import model.request.Comment;
import model.request.Request;
import model.request.RequestType;
import model.user.Admin;
import model.user.Customer;
import view.LogIn;

public class RequestController {
    public static void addRequest(Request request) {
        Admin.getRequests().add(request);
    }

    public static void removeRequest(String[] IDS) {
        for (int i = 0; i < IDS.length; i++) {
            for (Request a : Admin.getRequests()) {
                if (a.getRequestID() == Integer.parseInt(IDS[i])) {
                    if (Admin.getRequests().get(i).getType() == RequestType.SignUps) {
                        Admin.getRequests().remove(i);
                        break;
                    }
                    if (Admin.getRequests().get(i).getType() == RequestType.ChargeCredit) {

                        break;
                    }
                }
            }
        }
    }

    public static void typeChecker(String[] IDS) {
        for (int i = 0; i < IDS.length; i++) {
            for (Request a : Admin.getRequests()) {
                if (a.getRequestID() == Integer.parseInt(IDS[i])) {
                    if (Admin.getRequests().get(i).getType() == RequestType.SignUps) {
                        AdminController.getCustomers().add(a.getCustomer());
                        LogIn.customerLogIn();
                    }
                    if (Admin.getRequests().get(i).getType() == RequestType.ChargeCredit) {

                    }
                    if (Admin.getRequests().get(i).getType() == RequestType.Comments) {
                        for (Product c : Admin.getProducts()) {
                            for (Comment b : c.getComments()) {
                                if (b.isBought()) {
                                    c.getComments().add(a.getComment());
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}