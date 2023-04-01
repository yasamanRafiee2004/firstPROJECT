package model.user;

import model.admin.Request;
import model.product.Product;

import java.util.ArrayList;

public class Admin extends User{
    private static ArrayList<Request> requests = new ArrayList<>();
    private static ArrayList<Product> products = new ArrayList<>();
    private static final Admin admin = new Admin("admin","","","admin");

    private Admin(String userName, String email, String phoneNumber, String password) {
        super(userName, email, phoneNumber, password);
    }
    public static ArrayList<Request> getRequests(){
        return requests;
    }
    public static ArrayList<Product> getProducts(){
        return products;
    }
    public static Admin getAdmin(){
        return admin;
    }
}
