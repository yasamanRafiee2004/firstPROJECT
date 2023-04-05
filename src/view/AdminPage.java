package view;

import controller.AdminController;
import controller.RequestController;
import model.request.Request;
import model.request.RequestType;
import model.user.Admin;
import model.user.Customer;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AdminPage {


    public static void getCommand() {
        Scanner input = new Scanner(System.in);
        boolean adminMenu = true;
        while (adminMenu) {
            System.out.println(" please enter a number");
            System.out.println("1.HELP!");
            System.out.println("2.I already know the process.");
            int firstCommand = input.nextInt();
            if (firstCommand == 1) {
                System.out.println("if you want to add product :" + "\n" + "enter : Add + the product type + the properties of the product.");
                System.out.println("if you want to remove product :" + "\n" + "enter : Remove + product name + product price");
                System.out.println("if you want to edit product :" + "\n" + "enter : Edit + recent name + recent price + after editing name +after editing price + after editing inventory.");
                System.out.println("if you want to view the customers list :" + "\n" + "enter : Show Customers");
                System.out.println("if you want to view the requests list and answer them :" + "\n" + "enter : Show Requests");
            } else if (firstCommand == 2) {
                boolean help = true;
                input.nextLine();
                String command = input.nextLine();
                String[] words = command.split("\\s");
                for (int i = 0; i < words.length; i++) {
                    if (Objects.equals(words[i], "Add")) {
                        if (Objects.equals(words[i + 1], "Bike")) {
                            AdminController.addBike(words, i);
                        } else if (Objects.equals(words[i + 1], "Food")) {
                            AdminController.addFood(words, i);
                        } else if (Objects.equals(words[i + 1], "Personal Computer")) {
                            AdminController.addComputer(words, i);
                        } else if (Objects.equals(words[i + 1], "SSD")) {
                            AdminController.addSSD(words, i);
                        } else if (Objects.equals(words[i + 1], "USB")) {
                            AdminController.addUSB(words, i);
                        } else if (Objects.equals(words[i + 1], "Car")) {
                            AdminController.addCar(words, i);
                        } else if (Objects.equals(words[i + 1], "Pencil")) {
                            AdminController.addPencil(words, i);
                        } else if (Objects.equals(words[i + 1], "Pen")) {
                            AdminController.addPen(words, i);
                        } else if (Objects.equals(words[i + 1], "NoteBook")) {
                            AdminController.addNoteBook(words, i);
                        } else {
                            help = false;
                        }
                    }
                    if (Objects.equals(words[i], "Remove")) {
                        AdminController.removeProduct(words, i);
                    }
                    if (Objects.equals(words[i], "Edit")) {
                        AdminController.editProduct(words, i);
                    }
                    if (Objects.equals(words[i], "Show")) {
                        if (Objects.equals(words[i + 1], "Customers")) {
                            if (AdminController.getCustomers().size() == 0) {
                                System.out.println("no customer exists yet!");
                            } else {
                                for (Customer customer : AdminController.getCustomers()) {
                                    System.out.println(customer.toString());
                                }
                            }
                        } else if (Objects.equals(words[i + 1], "Requests")) {
                            requests(Admin.getRequests());
                        }
                    }
                    if (!help) {
                        System.out.println("wrong command");
                    }
                }
            }
            System.out.println("If you want to continue in admin menu enter 1 or If you want to exit enter 0 ");
            int answer = input.nextInt();
            if (answer == 0) {
                adminMenu = false;
            }
        }
    }

    public static void requests(ArrayList<Request> requests) {
        Scanner input = new Scanner(System.in);
        for (Request a : requests) {
            if (a.getType() == RequestType.SignUps) {
                System.out.println("signup requests" + a.getCustomer().toString() + " ID : " + a.getRequestID() + "\n");
            }
            if (a.getType() == RequestType.ChargeCredit) {
                System.out.println("charging credit requests" + a.getChargeCredit() + " ID : " + a.getRequestID() + "\n");

            }
            if (a.getType() == RequestType.Comments) {
                System.out.println("comment requests" + a.getComment().toString() + " ID : " + a.getRequestID() + "\n");

            }
        }
        if (requests.size() == 0) {
            System.out.println("you don't have any requests!");
        } else {
            System.out.println("do you want to accept request or reject it?");
            System.out.println("1.accept 2.reject");
            int userAnswer = input.nextInt();
            if (userAnswer == 1) {
                System.out.println("please enter the ID of the requests that you want to accept.");
                input.nextLine();
                String ID = input.nextLine();
                String[] IDs = ID.split("\\s");
                RequestController.accept(IDs);
            }
            if (userAnswer == 2) {
                System.out.println("please enter the ID of the requests that you don't want to accept.");
                input.nextLine();
                String ID1 = input.nextLine();
                String[] IDs1 = ID1.split("\\s");
                RequestController.notAccept(IDs1);
            }
            if (userAnswer != 1 && userAnswer != 2) {
                System.out.println("wrong command!");
            }
        }
    }
}
