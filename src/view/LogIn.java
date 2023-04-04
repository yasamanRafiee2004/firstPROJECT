package view;

import controller.AdminController;
import model.user.Admin;
import model.user.Customer;

import java.util.Objects;
import java.util.Scanner;

public class LogIn {
    public static void adminLogIn() {
        boolean logIn = true;
        while (logIn) {
            Scanner input = new Scanner(System.in);
            System.out.println("please enter admin user name and user pass in order.");
            String userName = input.nextLine();
            String userPass = input.nextLine();
            if (Objects.equals(userName, "admin") && Objects.equals(userPass, "admin")) {
                AdminPage.getCommand();
                logIn = false;
            } else {
                System.out.println("wrong information");
            }
        }
    }

    public static void customerLogIn() {
        Scanner input = new Scanner(System.in);
        boolean logIn = true;
        while (logIn) {
            System.out.println("please enter your user name and user pass in order.");
            String userName = input.nextLine();
            String userPass = input.nextLine();
            for (Customer a : AdminController.getCustomers()) {
                if (Objects.equals(a.getUserName(), userName) && Objects.equals(a.getPassword(), userPass)) {
                    System.out.println("welcome in!");
                    CustomerPage.customerCase();
                    logIn=false;
                } else {
                    System.out.println("wrong information");
                }
            }
        }
    }
}