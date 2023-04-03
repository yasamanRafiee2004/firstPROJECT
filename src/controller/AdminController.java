package controller;

import model.product.Product;
import model.product.ProductCategory;
import model.product.digitalproduct.PersonalComputer;
import model.product.digitalproduct.SSD;
import model.product.digitalproduct.USB;
import model.product.foodproduct.Food;
import model.product.stationaryproduct.NoteBook;
import model.product.stationaryproduct.Pen;
import model.product.stationaryproduct.Pencil;
import model.product.stationaryproduct.PencilCategory;
import model.product.vehicleproduct.Bike;
import model.product.vehicleproduct.BikeType;
import model.product.vehicleproduct.Car;
import model.user.Admin;
import model.user.Customer;
import view.SignUp;

import java.util.ArrayList;
import java.util.Objects;

public class AdminController {
    private static ArrayList<Customer> customers = new ArrayList<>();

    public static ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomers(Customer customer) {
        customers.add(customer);
    }

    public static void addCar(String[] words, int i) {
        String name = words[i + 2];
        int price = Integer.parseInt(words[i + 3]);
        ProductCategory category = ProductCategory.valueOf(words[i + 4]);
        int numOfInventory = Integer.parseInt(words[i + 5]);
        String companyName = words[i + 6];
        int engineCapacity = Integer.parseInt(words[i + 7]);
        Boolean automatic = Boolean.valueOf(words[i + 8]);
        Car car = new Car(name, price, category, numOfInventory, companyName, engineCapacity, automatic);
        Admin.getProducts().add(car);
    }

    public static void addBike(String[] words, int i) {
        String name = words[i + 2];
        int price = Integer.parseInt(words[i + 3]);
        ProductCategory category = ProductCategory.valueOf(words[i + 4]);
        int numOfInventory = Integer.parseInt(words[i + 5]);
        String companyName = words[i + 6];
        BikeType type = BikeType.valueOf(words[i + 7]);
        Bike bike = new Bike(name, price, category, numOfInventory, companyName, type);
        Admin.getProducts().add(bike);
    }

    public static void addFood(String[] words, int i) {
        String name = words[i + 2];
        int price = Integer.parseInt(words[i + 3]);
        ProductCategory category = ProductCategory.valueOf(words[i + 4]);
        int numOfInventory = Integer.parseInt(words[i + 5]);
        String productionDate = words[i + 6];
        String expirationDate = words[i + 7];
        Food food = new Food(name, price, category, numOfInventory, productionDate, expirationDate);
        Admin.getProducts().add(food);
    }

    public static void addSSD(String[] words, int i) {
        String name = words[i + 2];
        int price = Integer.parseInt(words[i + 3]);
        ProductCategory category = ProductCategory.valueOf(words[i + 4]);
        int numOfInventory = Integer.parseInt(words[i + 5]);
        int weight = Integer.parseInt(words[i + 6]);
        int dimensions = Integer.parseInt(words[i + 7]);
        int capacity = Integer.parseInt(words[i + 8]);
        double readingSpeed = Double.parseDouble(words[i + 9]);
        double writingSpeed = Double.parseDouble(words[i + 10]);
        SSD ssd = new SSD(name, price, category, weight, dimensions, capacity, numOfInventory, readingSpeed, writingSpeed);
        Admin.getProducts().add(ssd);
    }

    public static void addNoteBook(String[] words, int i) {
        String name = words[i + 2];
        int price = Integer.parseInt(words[i + 3]);
        ProductCategory category = ProductCategory.valueOf(words[i + 4]);
        int numOfInventory = Integer.parseInt(words[i + 5]);
        String country = words[i + 6];
        int paperNum = Integer.parseInt(words[i + 7]);
        String paperType = words[i + 8];
        NoteBook noteBook = new NoteBook(name, price, category, numOfInventory, country, paperNum, paperType);
        Admin.getProducts().add(noteBook);
    }

    public static void addPen(String[] words, int i) {
        String name = words[i + 2];
        int price = Integer.parseInt(words[i + 3]);
        ProductCategory category = ProductCategory.valueOf(words[i + 4]);
        int numOfInventory = Integer.parseInt(words[i + 5]);
        String country = words[i + 6];
        String color = words[i + 7];
        Pen pen = new Pen(name, price, category, numOfInventory, country, color);
        Admin.getProducts().add(pen);
    }

    public static void addPencil(String[] words, int i) {
        String name = words[i + 2];
        int price = Integer.parseInt(words[i + 3]);
        ProductCategory category = ProductCategory.valueOf(words[i + 4]);
        int numOfInventory = Integer.parseInt(words[i + 5]);
        String country = words[i + 6];
        PencilCategory pencilCategory = PencilCategory.valueOf(words[i + 7]);
        Pencil pencil = new Pencil(name, price, category, numOfInventory, country, pencilCategory);
        Admin.getProducts().add(pencil);
    }

    public static void addUSB(String[] words, int i) {
        String name = words[i + 2];
        int price = Integer.parseInt(words[i + 3]);
        ProductCategory category = ProductCategory.valueOf(words[i + 4]);
        int numOfInventory = Integer.parseInt(words[i + 5]);
        int weight = Integer.parseInt(words[i + 6]);
        int dimensions = Integer.parseInt(words[i + 7]);
        int capacity = Integer.parseInt(words[i + 8]);
        int version = Integer.parseInt(words[i + 9]);
        USB usb = new USB(name, price, category, numOfInventory, weight, dimensions, capacity, version);
        Admin.getProducts().add(usb);
    }

    public static void addComputer(String[] words, int i) {
        String name = words[i + 2];
        int price = Integer.parseInt(words[i + 3]);
        ProductCategory category = ProductCategory.valueOf(words[i + 4]);
        int numOfInventory = Integer.parseInt(words[i + 5]);
        int weight = Integer.parseInt(words[i + 6]);
        int dimensions = Integer.parseInt(words[i + 7]);
        String CPUModel = words[i + 8];
        int RAMCapacity = Integer.parseInt(words[i + 9]);
        PersonalComputer computer = new PersonalComputer(name, price, category, numOfInventory, weight, dimensions, CPUModel, RAMCapacity);
        Admin.getProducts().add(computer);
    }

    public static void removeProduct(String[] words, int i) {
        int productPrice = Integer.parseInt(words[i + 2]);
        for (Product product : Admin.getProducts()) {
            if (product.getProductName().equals(words[i + 1])) {
                if (product.getProductPrice() == productPrice) {
                    Admin.getProducts().remove(product);
                }
            }
        }
    }

    public static void editProduct(String[] words, int i) {
        int productPrice = Integer.parseInt(words[i + 2]);
        for (Product product : Admin.getProducts()) {
            if (product.getProductName().equals(words[i + 1])) {
                if (product.getProductPrice() == productPrice) {
                    product.setProductName(words[i + 3]);
                    product.setProductPrice(Integer.parseInt(words[i + 4]));
                    product.setNumOfInventory(Integer.parseInt(words[i + 5]));
                }
            }
        }
    }
}
