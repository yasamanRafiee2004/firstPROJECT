package view;

import controller.CustomerController;
import controller.RequestController;
import model.product.Product;
import model.request.Comment;
import model.request.Request;
import model.request.RequestType;
import model.user.Admin;
import model.user.Customer;

import java.util.Objects;
import java.util.Scanner;

public class SingleProductPage {
    public static void showInfo(String productID, Customer customer) {
        Scanner scanner = new Scanner(System.in);
        boolean help = true;
        while (help) {
            for (Product a : Admin.getProducts()) {
                if (productID.equals(a.getProductID().toString())) {
                    System.out.println(a.toString());
                }
            }
            System.out.println("what do you want to do?");
            System.out.println("1.view the comments");
            System.out.println("2.add product to the carts");
            System.out.println("3.add a comment");
            int answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    for (Product a : Admin.getProducts()) {
                        if (a.getProductID().toString().equals(productID)) {
                            System.out.println(a.getComments().toString());
                        }
                    }
                    break;
                case 2:
                    for (Product a : Admin.getProducts()) {
                        if (productID.equals(a.getProductID().toString())) {
                            if (a.getNumOfInventory() > 0) {
                                if (customer.getCarts().size() != 0) {
                                    for (Product b : customer.getCarts()) {
                                        if (!Objects.equals(a.getProductName(), b.getProductName()) && a.getProductPrice() != b.getProductPrice()) {
                                            CustomerController.addToCarts(a, customer);
                                            System.out.println("the product has successfully added to your carts");
                                        } else {
                                            System.out.println("this product already exist in your carts!");
                                        }
                                        break;
                                    }
                                } else {
                                    CustomerController.addToCarts(a, customer);
                                    System.out.println("the product has successfully added to your carts");
                                    break;
                                }
                            } else {
                                System.out.println("this product inventory is not enough");
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    for (Product a : Admin.getProducts()) {
                        if (a.getProductID().toString().equals(productID)) {
                            for (int i = 0; i < customer.getPurchases().size(); i++) {
                                if (customer.getPurchases().get(i).getBoughtProducts().contains(a)) {
                                    System.out.println("please enter the comment!");
                                    scanner.nextLine();
                                    String comment = scanner.nextLine();
                                    Comment comment1 = new Comment(customer, a.getProductID(), comment, true);
                                    comment1.setText(comment);
                                    Request request = new Request(customer, RequestType.Comments);
                                    request.setComment(comment1);
                                    RequestController.addRequest(request);
                                    System.out.println("your comment request is sent to admin.please wait a few second...");
                                    LogIn.adminLogIn();
                                }
                            }
                        }

                    }
                    break;
            }
            System.out.println("If you want to continue in this product page enter 1 or If you want to exit enter 0 ");
            int answer2 = scanner.nextInt();
            if (answer2 == 0) {
                help = false;
            }
        }
    }
}
