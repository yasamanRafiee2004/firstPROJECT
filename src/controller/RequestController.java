package controller;

import model.product.Product;
import model.request.Comment;
import model.request.Request;
import model.request.RequestType;
import model.user.Admin;
import view.CustomerPage;

public class RequestController {
    public static void addRequest(Request request) {
        Admin.getRequests().add(request);
    }

    public static void notAccept(String[] IDs1) {
        for (String a : IDs1) {
            int id = Integer.parseInt(a);
            for (Request request : Admin.getRequests()) {
                if (request.getRequestID() == id) {
                    Admin.getRequests().remove(request);
                    break;
                }
            }
        }
    }

    public static void accept(String[] IDS) {
        for (String a : IDS) {
            int id = Integer.parseInt(a);
            for (Request request : Admin.getRequests()) {
                if (request.getRequestID() == id) {
                    if (request.getType() == RequestType.SignUps) {
                        AdminController.getCustomers().add(request.getCustomer());
                        Admin.getRequests().remove(request);
                        CustomerPage.customerCase(request.getCustomer());
                        break;
                    }
                    if (request.getType() == RequestType.ChargeCredit) {
                        double number = request.getChargeCredit() + request.getCustomer().getCreditBalance();
                        request.getCustomer().setCreditBalance(number);
                        Admin.getRequests().remove(request);
                        break;
                    }
                    if (request.getType() == RequestType.Comments) {
                        Comment comment = request.getComment();
                        for (Product product : Admin.getProducts()) {
                            if (product.getProductID() == comment.getProductID()) {
                                ProductController.addComment(product, comment);
                                Admin.getRequests().remove(request);
                                break;
                            }
                        }
                        break;
                    }
                }
            }
        }
    }

}