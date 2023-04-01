package controller;

import model.product.Product;
import model.product.digitalproduct.PersonalComputer;
import model.product.digitalproduct.SSD;
import model.product.digitalproduct.USB;
import model.product.foodproduct.Food;
import model.product.stationaryproduct.NoteBook;
import model.product.stationaryproduct.Pen;
import model.product.stationaryproduct.Pencil;
import model.product.vehicleproduct.Bike;
import model.product.vehicleproduct.Car;
import model.user.Admin;
import model.user.Customer;

import java.util.ArrayList;
import java.util.Objects;

public class AdminController {
    private static ArrayList<Customer> customers = new ArrayList<>();
    public static ArrayList<Customer> getCustomers(){
        return customers;
    }
    public void addCustomers(Customer customer){
        customers.add(customer);
    }
    public static void addCar(Car car){
        Admin.getProducts().add(car);
    }
    public static void addBike(Bike bike){
        Admin.getProducts().add(bike);
    }
    public static void addFood(Food food){
        Admin.getProducts().add(food);
    }
    public static void addSSD(SSD ssd){
        Admin.getProducts().add(ssd);
    }
    public static void addNoteBook(NoteBook noteBook){
        Admin.getProducts().add(noteBook);
    }
    public static void addPen(Pen pen){
        Admin.getProducts().add(pen);
    }
    public static void addPencil(Pencil pencil){
        Admin.getProducts().add(pencil);
    }
    public static void addUSB(USB usb){
        Admin.getProducts().add(usb);
    }
    public static void addComputer(PersonalComputer personalComputer){
        Admin.getProducts().add(personalComputer);
    }
    public static void removeProduct(String[] words , int i){
        int productPrice = Integer.parseInt(words[i+2]);
        for (Product product : Admin.getProducts()){
            if (product.getProductName().equals(words[i+1])){
                if (product.getProductPrice() == productPrice){
                    Admin.getProducts().remove(product);
                }
            }
        }
    }
    public static void editProduct(String[] words , int i){
        int productPrice = Integer.parseInt(words[i+2]);
        for (Product product : Admin.getProducts()){
            if (product.getProductName().equals(words[i+1])){
                if (product.getProductPrice() == productPrice){
                    product.setProductName(words[i + 3]);
                    product.setProductPrice(Integer.parseInt(words[i+4]));
                    product.setNumOfInventory(Integer.parseInt(words[i+5]));
                }
            }
        }
    }
}
