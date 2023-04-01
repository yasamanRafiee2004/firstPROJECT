package view;
import java.util.Scanner;
public class Start {
    public static void start() {
        boolean help1 = false;
        Scanner startInput = new Scanner(System.in);
        System.out.println("welcome to our web site");
        System.out.println("enter the relatable number");
        System.out.println("1.Admin");
        System.out.println("2.Customer");
        int answer = startInput.nextInt();
        if (answer == 1) {
            LogIn.adminLogIn();
        }
        if (answer == 2){

        }
        else {
            System.out.println("wrong command");
        }
    }


    }
