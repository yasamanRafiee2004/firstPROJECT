package view;

import controller.AdminController;
import controller.CustomerController;
import controller.RequestController;
import model.request.Request;
import model.request.RequestType;
import model.user.Customer;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp {

    public static Customer signUp() {
        Scanner input = new Scanner(System.in);
        String helpUser = null;
        boolean signUp = true;
        while (signUp) {
            System.out.println("please enter your email and phone number and user name and password in order");
            System.out.println("""
                    pay attention that :
                    Password must contain at least one digit [0-9].
                    Password must contain at least one lowercase Latin character [a-z].
                    Password must contain at least one uppercase Latin character [A-Z].
                    Password must contain at least one special character like ! @ # & ( ).
                    Password must contain a length of at least 8 characters and a maximum of 20 characters.""");
            String email = input.nextLine();
            String phoneNumber = input.nextLine();
            String userName = input.nextLine();
            String password = input.nextLine();
            boolean matching;
            boolean help = true;
            Pattern pattern = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@(gmail|yahoo)\\.com$");
            Matcher matcher = pattern.matcher(email);
            matching = matcher.find();
            if (matching) {
                for (Customer a : AdminController.getCustomers()) {
                    if (Objects.equals(a.getEmail(), email)) {
                        help = false;
                    }
                }
            }
            boolean matching1;
            Pattern pattern1 = Pattern.compile("^(\\+98|0)?9\\d{9}$");
            Matcher matcher1 = pattern1.matcher(phoneNumber);
            matching1 = matcher1.find();
            if (matching1) {
                for (Customer a : AdminController.getCustomers()) {
                    if (a.getPhoneNumber().equals(phoneNumber)) {
                        help = false;
                    }
                }
            }
            for (Customer a : AdminController.getCustomers()) {
                if (a.getPhoneNumber().equals(userName)) {
                    help = false;
                }
            }
            boolean matching2;
            Pattern pattern2 = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
            Matcher matcher2 = pattern2.matcher(password);
            matching2 = matcher2.find();
            if (matching2 && matching1 && matching) {
                helpUser = userName;
                if (help) {
                    Customer customer = new Customer(userName, email, phoneNumber, password, 0);
                    Request request = new Request(customer, RequestType.SignUps);
                    RequestController.addRequest(request);
                    System.out.println("your sign up request is sent to admin.please wait a few second...");
                    LogIn.adminLogIn();
                    signUp = false;
                } else {
                    System.out.println("there is already a user with this information!");
                }
            } else {
                System.out.println("wrong information format!");
            }
        }
        return CustomerController.returningCustomer(helpUser);
    }
}
