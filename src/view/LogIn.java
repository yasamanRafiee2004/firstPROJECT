package view;

import controller.AdminController;
import model.user.Admin;
import model.user.Customer;

import java.util.Objects;
import java.util.Scanner;

public class LogIn {

    public static void adminLogIn() {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter admin user name.");
        String userName = input.nextLine();
        System.out.println("please enter admin user pass.");
        String userPass = input.nextLine();
        if (Objects.equals(userName, "admin")) {
            if (Objects.equals(userPass, "admin")) {
                System.out.println("WELCOME ADMIN.");
                AdminPage.getCommand();
            }
            else {
                System.out.println("wrong information");
            }
        }
        else {
            System.out.println("wrong information");
        }
    }
    public static void customerLogIn(){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your user name.");
        String userName = input.nextLine();
        System.out.println("please enter your user pass.");
        String userPass = input.nextLine();
        for (Customer a : AdminController.getCustomers()){
            if (Objects.equals(a.getUserName(), userName) && Objects.equals(a.getPassword(), userPass)){
                System.out.println("welcome in!");
                /////customer menu
            }
            else {
                System.out.println("wrong information");
            }
        }
    }
}
