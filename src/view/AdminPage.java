package view;

import controller.AdminController;
import model.admin.Request;
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

import java.util.Objects;
import java.util.Scanner;

public class AdminPage {
    static Admin admin;

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
                System.out.println("if you want to remove product :" + "\n" + "enter : Remove + product ID");
                System.out.println("if you want to edit product :" + "\n" + "enter : Edit + recent name + recent price + after name +after price + after inventory.");
                System.out.println("if you want to view the customers list :" + "\n" + "enter : Show Customers");
                System.out.println("if you want to view the requests list :" + "\n" + "enter : Show Requests");
                System.out.println("if you want to answer the requests :" + "\n" + "enter : Answer");
            } else if (firstCommand == 2) {
                boolean help = true;
                input.nextLine();
                String command = input.nextLine();
                String[] words = command.split("\\s");
                int size = words.length;
                for (int i = 0; i < words.length; i++) {
                    if (Objects.equals(words[i], "Add")) {
                        String name = words[i + 2];
                        int price = Integer.parseInt(words[i + 3]);
                        ProductCategory category = ProductCategory.valueOf(words[i + 4]);
                        int numOfInventory = Integer.parseInt(words[i + 5]);
                        if (Objects.equals(words[i + 1], "Bike")) {
                            String companyName = words[i + 6];
                            BikeType type = BikeType.valueOf(words[i + 7]);
                            Bike bike = new Bike(name, price, category, numOfInventory, companyName, type);
                            AdminController.addBike(bike);

                        } else if (Objects.equals(words[i + 1], "Food")) {
                            String productionDate = words[i + 6];
                            String expirationDate = words[i + 7];
                            Food food = new Food(name, price, category, numOfInventory, productionDate, expirationDate);
                            AdminController.addFood(food);

                        } else if (Objects.equals(words[i + 1], "Personal Computer")) {
                            int weight = Integer.parseInt(words[i + 6]);
                            int dimensions = Integer.parseInt(words[i + 7]);
                            String CPUModel = words[i + 8];
                            int RAMCapacity = Integer.parseInt(words[i + 9]);
                            PersonalComputer computer = new PersonalComputer(name, price, category, numOfInventory, weight, dimensions, CPUModel, RAMCapacity);
                            AdminController.addComputer(computer);

                        } else if (Objects.equals(words[i + 1], "SSD")) {
                            int weight = Integer.parseInt(words[i + 6]);
                            int dimensions = Integer.parseInt(words[i + 7]);
                            int capacity = Integer.parseInt(words[i + 8]);
                            double readingSpeed = Double.parseDouble(words[i + 9]);
                            double writingSpeed = Double.parseDouble(words[i + 10]);
                            SSD ssd = new SSD(name, price, category, weight, dimensions, capacity, numOfInventory, readingSpeed, writingSpeed);
                            AdminController.addSSD(ssd);

                        } else if (Objects.equals(words[i + 1], "USB")) {
                            int weight = Integer.parseInt(words[i + 6]);
                            int dimensions = Integer.parseInt(words[i + 7]);
                            int capacity = Integer.parseInt(words[i + 8]);
                            int version = Integer.parseInt(words[i + 9]);
                            USB usb = new USB(name, price, category, numOfInventory, weight, dimensions, capacity, version);
                            AdminController.addUSB(usb);

                        } else if (Objects.equals(words[i + 1], "Car")) {
                            String companyName = words[i + 6];
                            int engineCapacity = Integer.parseInt(words[i + 7]);
                            Boolean automatic = Boolean.valueOf(words[i + 8]);
                            Car car = new Car(name, price, category, numOfInventory, companyName, engineCapacity, automatic);
                            AdminController.addCar(car);

                        } else if (Objects.equals(words[i + 1], "Pencil")) {
                            String country = words[i + 6];
                            PencilCategory pencilCategory = PencilCategory.valueOf(words[i + 7]);
                            Pencil pencil = new Pencil(name, price, category, numOfInventory, country, pencilCategory);
                            AdminController.addPencil(pencil);

                        } else if (Objects.equals(words[i + 1], "Pen")) {
                            String country = words[i + 6];
                            String color = words[i + 7];
                            Pen pen = new Pen(name, price, category, numOfInventory, country, color);
                            AdminController.addPen(pen);

                        } else if (Objects.equals(words[i + 1], "NoteBook")) {
                            String country = words[i + 6];
                            int paperNum = Integer.parseInt(words[i + 7]);
                            String paperType = words[i + 8];
                            NoteBook noteBook = new NoteBook(name, price, category, numOfInventory, country, paperNum, paperType);
                            AdminController.addNoteBook(noteBook);

                        } else {
                            help = false;
                        }
                    }
                    if (Objects.equals(words[i], "Remove")) {
                        AdminController.removeProduct(words, i);
                    }
                    if (Objects.equals(words[i], "Edit")) {
                        AdminController.editProduct(words, i);
                    } else {
                        help = false;
                    }
                    if (Objects.equals(words[i], "Show")) {
                        if (Objects.equals(words[i + 1], "Customers")) {
                            for (Customer customer : AdminController.getCustomers()) {
                                System.out.println(customer);
                            }
                        } else if (Objects.equals(words[i + 1], "Requests")) {
                            for (Request request : Admin.getRequests()) {
                                System.out.println(request);
                            }
                        } else {
                            help = false;
                        }
                    }
                    if (Objects.equals(words[i], "Answer")) {
                        for (Request request : Admin.getRequests()) {
                            System.out.println(request);
                            System.out.println("if you want to accept enter : Accept");
                            System.out.println("if you want to accept enter : Don't Accept");
                            String answer = input.nextLine();
                            if (Objects.equals(answer, "Accept")) {
                                ////
                                break;
                            } else if (Objects.equals(answer, "Don't Accept")) {
                                ////
                                break;
                            } else {
                                help = false;
                            }
                        }
                    } else {
                        help = false;
                    }
                }
                if (!help) {
                    System.out.println("wrong command");
                }
            }
            System.out.println("If you want to continue enter 1 or If you want to exit enter 0 ");
            startApp = continue1(input.nextInt());
        }
    }
}