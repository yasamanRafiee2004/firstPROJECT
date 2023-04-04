package controller;

import model.product.Product;
import model.product.ProductCategory;
import model.product.digitalproduct.PersonalComputer;
import model.user.Admin;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    public static ArrayList<Product> nameFilter(String name) {
        ArrayList<Product> filterName = new ArrayList<>();
        for (Product a : Admin.getProducts()) {
            if (a.getProductName().equals(name)) {
                filterName.add(a);
            }
        }
        return filterName;
    }

    public static ArrayList<Product> priceFilter(double price, double price1) {
        ArrayList<Product> filterPrice = new ArrayList<>();
        for (Product a : Admin.getProducts()) {
            if (price <= a.getProductPrice() && a.getProductPrice() <= price1) {
                filterPrice.add(a);
            }
        }
        return filterPrice;
    }

    public static ArrayList<Product> namePriceFilter(String name, double price, double price1) {
        ArrayList<Product> filterNamePrice = nameFilter(name);
        for (Product a : Admin.getProducts()) {
            if (price <= a.getProductPrice() && a.getProductPrice() <= price1) {
                filterNamePrice.add(a);
            }
        }
        return filterNamePrice;
    }

    public static ArrayList<Product> inventoryFilter(int inventory) {
        ArrayList<Product> filterInventory = new ArrayList<>();
        for (Product a : Admin.getProducts()) {
            if (a.getNumOfInventory() == inventory) {
                filterInventory.add(a);
            }
        }
        return filterInventory;
    }

    public static ArrayList<Product> scoreFilter(double average, double average1) {
        ArrayList<Product> filterScore = new ArrayList<>();
        for (Product a : Admin.getProducts()) {
            if (average <= a.getScoreAverage() && a.getScoreAverage() <= average1) {
                filterScore.add(a);
            }
        }
        return filterScore;
    }

    public static ArrayList<Product> CategoryFilter(String category) {
        ArrayList<Product> filterCategory = new ArrayList<>();
        for (Product a : Admin.getProducts()) {
            if (a.getProductCategory() == ProductCategory.valueOf(category)) {
                filterCategory.add(a);
            }
        }
        return filterCategory;
    }

    public static ArrayList<Product> CPUFilter(String CPU) {
        ArrayList<Product> CPUFilter = new ArrayList<>();
        for (Product a : Admin.getProducts()) {
            if (a instanceof PersonalComputer) {
                if (((PersonalComputer) a).getCPUModel().equals(CPU)) {
                    CPUFilter.add(a);
                }
            }
        }
        return CPUFilter;
    }

    public static ArrayList<Product> RAMFilter(int RAMCapacity) {
        ArrayList<Product> RAMFilter = new ArrayList<>();
        for (Product a : Admin.getProducts()) {
            if (a instanceof PersonalComputer) {
                if (((PersonalComputer) a).getRAMCapacity() == RAMCapacity) {
                    RAMFilter.add(a);
                }
            }
        }
        return RAMFilter;
    }

    public static ArrayList<Product> RAMCPUFilter(String CPU, int RAMCapacity) {
        ArrayList<Product> RAMFCPUFilter = CPUFilter(CPU);
        for (Product a : Admin.getProducts()) {
            if (a instanceof PersonalComputer) {
                if (((PersonalComputer) a).getRAMCapacity() == RAMCapacity) {
                    RAMFCPUFilter.add(a);
                }
            }
        }
        return RAMFCPUFilter;
    }

    public static String searchProduct(String name) {
        for (Product a : Admin.getProducts()) {
            if (a.getProductName().equals(name)) {
                return a.toString();
            }
        }
        return "this product does not exist";
    }
}
