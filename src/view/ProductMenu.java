package view;

import model.user.Admin;
import model.user.Customer;

import java.util.Scanner;

public class ProductMenu {

    public static void productCommand() {
        boolean product = true;
        while (product) {
            System.out.println("what do you want to do?");
            System.out.println("1.show all the products in pages");
            System.out.println("2.filter product by name");
            System.out.println("3.filter product by price range");
            System.out.println("4.filter product by name and price range");
            System.out.println("5.filter product by number of inventory");
            System.out.println("6.filter product by score range");
            System.out.println("7.filter product by category");
            System.out.println("8.filter product by CPU model");
            System.out.println("9.filter product by RAM capacity");
            System.out.println("10.filter product by CPU MODEL and RAM capacity");
            System.out.println("11.filter product by bike type");
            System.out.println("12.search a product by it's name.");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            switch (answer) {
                case 1: {
                    int pageNumber;
                    if (Admin.getProducts().size() % 3 == 0) {
                        pageNumber = Admin.getProducts().size() / 3;
                    } else {
                        pageNumber = (Admin.getProducts().size() / 3) + 1;
                    }
                    ProductPage.showProducts(pageNumber);
                    break;
                }
                case 2: {
                    ProductPage.nameFilter();
                    break;
                }
                case 3: {
                    ProductPage.priceFilter();
                    break;
                }
                case 4: {
                    ProductPage.namePriceFilter();
                    break;
                }
                case 5: {
                    ProductPage.inventoryFilter();
                    break;
                }
                case 6: {
                    ProductPage.scoreFilter();
                    break;
                }
                case 7: {
                    ProductPage.CategoryFilter();
                    break;
                }
                case 8: {
                    ProductPage.CPUFilter();
                    break;
                }
                case 9: {
                    ProductPage.RAMFilter();
                    break;
                }
                case 10: {
                    ProductPage.RAMCPUFilter();
                    break;
                }
                case 11:{
                    ProductPage.bikeTypeFilter();
                }
                case 12: {
                    ProductPage.searchProduct();
                    break;
                }
                default: {
                    System.out.println("wrong command");
                    break;
                }
            }
            System.out.println("If you want to continue in product menu enter 1 or If you want to exit enter 0 ");
            int answer1 = scanner.nextInt();
            if (answer1 == 0) {
                product = false;
            }
        }
    }
}
