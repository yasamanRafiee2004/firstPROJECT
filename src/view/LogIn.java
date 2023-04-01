package view;

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
}
