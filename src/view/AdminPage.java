package view;

import controller.AdminController;
import controller.RequestController;
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
import model.request.Request;
import model.request.RequestType;
import model.user.Admin;
import model.user.Customer;

import java.util.Objects;
import java.util.Scanner;

public class AdminPage {
    static boolean startApp = true;

    public static Boolean continue1(int answer) {
        if (answer == 0) {
            startApp = false;
            return startApp;
        }
        return startApp;
    }

    public static void getCommand() {
        Scanner input = new Scanner(System.in);
        while (startApp) {
            System.out.println(" please enter a number");
            System.out.println("1.HELP!");
            System.out.println("2.I already know the process.");
            int firstCommand = input.nextInt();
            if (firstCommand == 1) {
                System.out.println("if you want to add product :" + "\n" + "enter : Add + the product type + the properties of the product.");
                System.out.println("if you want to remove product :" + "\n" + "enter : Remove + product name + product price");
                System.out.println("if you want to edit product :" + "\n" + "enter : Edit + recent name + recent price + after name +after price + after inventory.");
                System.out.println("if you want to view the customers list :" + "\n" + "enter : Show Customers");
                System.out.println("if you want to view the requests list :" + "\n" + "enter : Show Requests");
                System.out.println("if you want to answer the requests :" + "\n" + "enter : Answer");
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
                        } else if (Objects.equals(words[i + 1], "USB"))
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
                    if (Objects.equals(words[i], "Remove")) {
                        AdminController.removeProduct(words, i);
                    }
                    if (Objects.equals(words[i], "Edit")) {
                        AdminController.editProduct(words, i);
                    }
                    if (Objects.equals(words[i], "Show")) {
                        if (Objects.equals(words[i + 1], "Customers")) {
                            for (Customer customer : AdminController.getCustomers()) {
                                System.out.println(customer.toString());
                            }
                        } else if (Objects.equals(words[i + 1], "Requests")) {
                            for (Request a : Admin.getRequests()) {
                                if (a.getType() == RequestType.valueOf("SignUps")) {
                                    System.out.println("signup requests" + a.getCustomer().toString() + "\n");
                                }
                                if (a.getType() == RequestType.valueOf("ChargeCredit")) {
                                    System.out.println("charging credit requests" + a.getChargeCredit().toString() + "\n");
                                }
                                if (a.getType() == RequestType.valueOf("Comments")) {
                                    System.out.println("comment requests" + a.getComment().toString() + "\n");
                                }
                            }
                        }
                    }
                    if (Objects.equals(words[i], "Answer")) {
                        int count = 1;
                        for (Request a : Admin.getRequests()) {
                            if (a.getType() == RequestType.valueOf("SignUps")) {
                                System.out.println(count + ".signup requests" + a.getCustomer().toString() + " ID : " + a.getRequestID() + "\n");
                                count++;
                            }
                            if (a.getType() == RequestType.valueOf("ChargeCredit")) {
                                System.out.println(count + ".charging credit requests" + a.getChargeCredit().toString() + " ID : " + a.getRequestID() + "\n");
                                count++;
                            }
                            if (a.getType() == RequestType.valueOf("Comments")) {
                                System.out.println(count + ".comment requests" + a.getComment().toString() + " ID : " + a.getRequestID() + "\n");
                                count++;
                            }
                        }
                        System.out.println("please enter the ID of the requests that you want to accept.");
                        String ID = input.nextLine();
                        String[] IDs = ID.split("\\s");
                        RequestController.typeChecker(IDs);
                        RequestController.removeRequest(IDs);

                    }
                    if (!help) {
                        System.out.println("wrong command");
                    }
                }
            }
            System.out.println("If you want to continue enter 1 or If you want to exit enter 0 ");
            startApp = continue1(input.nextInt());
        }
    }
}
