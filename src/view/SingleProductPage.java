package view;
import controller.CustomerController;
import model.product.Product;
import model.user.Admin;

import java.util.Scanner;

public class SingleProductPage {
    public static void showInfo(String productID) {
        Scanner scanner = new Scanner(System.in);
        for (Product a : Admin.getProducts()) {
            if (productID.equals(a.getProductID().toString())) {
                System.out.println(a.toString());
            }
        }
        System.out.println("what do you want to do?");
        System.out.println("1.see the comments");
        System.out.println("2.add product to the carts");
        int answer = scanner.nextInt();
        boolean help = true;
        while (help) {
            switch (answer) {
                case 1:
                    for (Product a : Admin.getProducts()) {
                        if (productID.equals(a.getProductID().toString())) {
                            System.out.println(a.getComments().toString());
                        }
                    }
                    break;
                case 2:
                    for (Product a : Admin.getProducts()) {
                        if (productID.equals(a.getProductID().toString())) {
                            if (a.getNumOfInventory() > 0) {
                                CustomerController.addToCarts(a);
                                System.out.println("the product has successfully added to your carts");
                            } else {
                                System.out.println("this product inventory is not enough");
                            }
                        }
                    }
                    break;
            }
            System.out.println("If you want to continue enter 1 or If you want to exit enter 0 ");
            int answer2 = scanner.nextInt();
            if (answer2 == 0){
                help = false;
            }
        }
    }
}
