package view;

import controller.AdminController;
import controller.ProductController;
import model.product.Product;
import model.user.Admin;
import model.user.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductPage {
    public static void showAndAddProducts(int pageNumber) {
        Scanner sc = new Scanner(System.in);
        if (Admin.getProducts().size() == 0) {
            System.out.println("no product exist!");
        } else {
            for (int j = 0; j < pageNumber; j++) {
                System.out.println("page" + (j + 1) + ".");
                for (int i = ((j) * 3); i < ((j + 1) * 3); i++) {
                    if ((i + 1) > Admin.getProducts().size()) {
                        break;
                    }
                    System.out.println("ID: " + Admin.getProducts().get(i).getProductID() + " name: " + Admin.getProducts().get(i).getProductName() + " inventory: " + Admin.getProducts().get(i).getNumOfInventory() + " price: " + Admin.getProducts().get(i).getProductPrice() + " score: " + Admin.getProducts().get(i).getScoreAverage());
                }
                if (pageNumber > (j + 1)) {
                    System.out.println("do you want to visit next page?");
                    System.out.println("1.yes 2.no");
                    int answer = sc.nextInt();
                    if (answer == 2) {
                        break;
                    }
                } else {
                    break;
                }
            }
            System.out.println("if you want to visit any product please enter 1 if you don't enter 0");
            int answer2 = sc.nextInt();
            if (answer2 == 1) {
                System.out.println("please enter your user name first");
                sc.nextLine();
                String userName = sc.nextLine();
                for (Customer a : AdminController.getCustomers()) {
                    if (a.getUserName().equals(userName)) {
                        System.out.println("please enter the product ID");
                        String Id = sc.nextLine();
                        SingleProductPage.showInfo(Id, a);
                    }
                    else {
                        System.out.println("you should sign up first!");
                    }
                    break;
                }
            }
        }
    }

    public static void showProducts(int pageNumber) {
        Scanner sc = new Scanner(System.in);
        if (Admin.getProducts().size() == 0) {
            System.out.println("no product exist!");
        } else {
            for (int j = 0; j < pageNumber; j++) {
                System.out.println("page" + (j + 1) + ".");
                for (int i = ((j) * 3); i < ((j + 1) * 3); i++) {
                    if ((i + 1) > Admin.getProducts().size()) {
                        break;
                    }
                    System.out.println("ID: " + Admin.getProducts().get(i).getProductID() + " name: " + Admin.getProducts().get(i).getProductName() + " inventory: " + Admin.getProducts().get(i).getNumOfInventory() + " price: " + Admin.getProducts().get(i).getProductPrice() + " score: " + Admin.getProducts().get(i).getScoreAverage());
                }
                if (pageNumber > (j + 1)) {
                    System.out.println("do you want to visit next page?");
                    System.out.println("1.yes 2.no");
                    int answer = sc.nextInt();
                    if (answer == 2) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public static void nameFilter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the name you want to do filter for:");
        String name = scanner.nextLine();
        ArrayList<Product> filterName = ProductController.nameFilter(name);
        for (Product b : filterName) {
            System.out.println(b.toString());
        }
    }

    public static void priceFilter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the first interval and last interval of the price you want to do filter for:");
        double price = scanner.nextDouble();
        double price1 = scanner.nextDouble();
        ArrayList<Product> filterPrice = ProductController.priceFilter(price, price1);
        for (Product b : filterPrice) {
            System.out.println(b.toString());
        }
    }

    public static void namePriceFilter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the name and the first interval and last interval of the price you want to do filter for:");
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        double price1 = scanner.nextDouble();
        ArrayList<Product> filterNamePrice = ProductController.namePriceFilter(name, price, price1);
        for (Product b : filterNamePrice) {
            System.out.println(b.toString());
        }
    }

    public static void inventoryFilter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number of inventory you want to do filter for:");
        int inventory = scanner.nextInt();
        ArrayList<Product> filterInventory = ProductController.inventoryFilter(inventory);
        for (Product b : filterInventory) {
            System.out.println(b.toString());
        }
    }

    public static void scoreFilter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the the first interval and last interval of the score you want to do filter for:");
        double average = scanner.nextDouble();
        double average1 = scanner.nextDouble();
        ArrayList<Product> filterScore = ProductController.scoreFilter(average, average1);
        for (Product b : filterScore) {
            System.out.println(b.toString());
        }
    }

    public static void CategoryFilter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the category you want to do filter for:");
        String category = scanner.nextLine();
        ArrayList<Product> filterCategory = ProductController.CategoryFilter(category);
        for (Product b : filterCategory) {
            System.out.println(b.toString());
        }
    }

    public static void CPUFilter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the CPU model you want to do filter for:");
        String CPU = scanner.nextLine();
        ArrayList<Product> CPUFilter = ProductController.CPUFilter(CPU);
        for (Product b : CPUFilter) {
            System.out.println(b.toString());
        }
    }

    public static void RAMFilter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the RAM capacity you want to do filter for:");
        int RAMCapacity = scanner.nextInt();
        ArrayList<Product> RAMFilter = ProductController.RAMFilter(RAMCapacity);
        for (Product b : RAMFilter) {
            System.out.println(b.toString());
        }
    }

    public static void bikeTypeFilter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the bike type you want to do filter for:");
        String bikeCategory = scanner.nextLine();
        ArrayList<Product> RAMFilter = ProductController.bikeTypeFilter(bikeCategory);
        for (Product b : RAMFilter) {
            System.out.println(b.toString());
        }
    }

    public static void RAMCPUFilter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the CPU model and the RAM capacity you want to do filter for:");
        String CPU = scanner.nextLine();
        int RAMCapacity = scanner.nextInt();
        ArrayList<Product> RAMCPUFilter = ProductController.RAMCPUFilter(CPU, RAMCapacity);
        for (Product b : RAMCPUFilter) {
            System.out.println(b.toString());
        }
    }

    public static void searchProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the product name");
        String name = scanner.nextLine();
        System.out.println(ProductController.searchProduct(name));
    }
}


