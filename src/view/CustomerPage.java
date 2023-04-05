package view;

import controller.AdminController;
import controller.CustomerController;
import controller.ProductController;
import controller.RequestController;
import model.product.Product;
import model.request.Request;
import model.request.RequestType;
import model.user.Admin;
import model.user.Customer;
import model.user.PurchaseInVoice;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerPage {
    public void findCustomer() {
        Customer a = SignUp.signUp();
        customerCase(a);
    }


    public static void customerCase(Customer customer) {
        Scanner sc = new Scanner(System.in);
        int pageNumber;
        boolean customerMenu = true;
        while (customerMenu) {
            System.out.println("what do you want to do?");
            System.out.println("1.view personal information.");
            System.out.println("2.edit the personal information(you can't edit you user name)");
            System.out.println("3.add product to the carts/add comment/view comments");
            System.out.println("4.view the carts");
            System.out.println("5.view the products");
            System.out.println("6.remove product from the carts");
            System.out.println("7.charge account credit");
            System.out.println("8.complete the purchase process");
            System.out.println("9.view purchase invoice");
            int answer = sc.nextInt();
            switch (answer) {
                case 1:
                    System.out.println(customer.toString());
                    break;
                case 2:
                    editInfo(customer);
                    System.out.println("new personal information : ");
                    System.out.println(customer.toString());
                    break;

                case 3:
                    if (Admin.getProducts().size() % 3 == 0) {
                        pageNumber = Admin.getProducts().size() / 3;
                    } else {
                        pageNumber = (Admin.getProducts().size() / 3) + 1;
                    }
                    ProductPage.showAndAddProducts(pageNumber);
                    break;

                case 4:
                    if (customer.getCarts() == null) {
                        System.out.println("you don't have any product in your basket");
                    } else {
                        for (Product a : customer.getCarts()) {
                            System.out.println("name : " + a.getProductName() + " product ID:" + a.getProductID() + " price:" + a.getProductPrice() + " inventory:" + a.getNumOfInventory());
                        }
                    }
                    break;

                case 5:
                    if (Admin.getProducts().size() % 3 == 0) {
                        pageNumber = Admin.getProducts().size() / 3;
                    } else {
                        pageNumber = (Admin.getProducts().size() / 3) + 1;
                    }
                    ProductPage.showProducts(pageNumber);
                    break;
                case 6:
                    for (Product a : customer.getCarts()) {
                        System.out.println(a.toString());
                    }
                    System.out.println("please enter the product ID you want to remove");
                    sc.nextLine();
                    String ID1 = sc.next();
                    CustomerController.removeCarts(ID1, customer);
                    break;

                case 7:
                    increaseBalance(customer);
                    break;

                case 8:
                    completePurchase(customer);
                    break;

                case 9:
                    for (PurchaseInVoice a : customer.getPurchases()) {
                        System.out.println(a.toString());
                    }
                    showPurchase();
                    break;
                default:
                    System.out.println("wrong command!");
                    break;
            }

            System.out.println("If you want to continue in customer menu enter 1 or If you want to exit enter 0 ");
            int answer1 = sc.nextInt();
            if (answer1 == 0) {
                customerMenu = false;
            }
        }
    }

    public static void editInfo(Customer customer) {
        boolean edit = true;
        while (edit) {
            System.out.println("what do you want to edit?");
            System.out.println("1.email" + "\n" + "2.phone number" + "\n" + "3.password");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input) {
                case 1: {
                    System.out.println("please enter your new email");
                    sc.nextLine();
                    String email = sc.nextLine();
                    boolean matching;
                    boolean help = true;
                    Pattern pattern = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@(gmail|yahoo)\\.com$");
                    Matcher matcher = pattern.matcher(email);
                    matching = matcher.find();
                    if (matching) {
                        for (Customer a : AdminController.getCustomers()) {
                            if (Objects.equals(a.getEmail(), email)) {
                                System.out.println("there is already a user with this information!");
                            } else {
                                customer.setEmail(email);
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("please enter your new phone number");
                    sc.nextLine();
                    String phoneNumber = sc.nextLine();
                    boolean matching1;
                    boolean help = true;
                    Pattern pattern1 = Pattern.compile("^(\\+98|0)?9\\d{9}$");
                    Matcher matcher1 = pattern1.matcher(phoneNumber);
                    matching1 = matcher1.find();
                    if (matching1) {
                        for (Customer a : AdminController.getCustomers()) {
                            if (a.getPhoneNumber().equals(phoneNumber)) {
                                System.out.println("there is already a user with this information!");
                            } else {
                                customer.setPhoneNumber(phoneNumber);
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    boolean matching2;
                    System.out.println("""
                            pay attention that :
                            Password must contain at least one digit [0-9].
                            Password must contain at least one lowercase Latin character [a-z].
                            Password must contain at least one uppercase Latin character [A-Z].
                            Password must contain at least one special character like ! @ # & ( ).
                            Password must contain a length of at least 8 characters and a maximum of 20 characters.""");
                    System.out.println("now please enter an password : ");
                    sc.nextLine();
                    String password = sc.nextLine();
                    sc.nextLine();
                    Pattern pattern2 = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
                    Matcher matcher2 = pattern2.matcher(password);
                    matching2 = matcher2.find();
                    if (matching2) {
                        for (Customer a : AdminController.getCustomers()) {
                            customer.setPassword(password);
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("wrong command");
                    break;
                }
            }
            System.out.println("If you want to continue in edit menu enter 1 or If you want to exit enter 0 ");
            int answer1 = sc.nextInt();
            if (answer1 == 0) {
                edit = false;
            }
        }
    }

    public static void increaseBalance(Customer customer) {
        Scanner sc = new Scanner(System.in);
        boolean balance = true;
        while (balance) {
            System.out.println("please enter your bank account number , CVV2 , password , amount of money you want to add to your balance in order ");
            String bankAccNum = sc.nextLine();
            String CVV2 = sc.nextLine();
            String password = sc.nextLine();
            double money = sc.nextLong();
            boolean matching;
            Pattern pattern = Pattern.compile("^\\d{16}$");
            Matcher matcher = pattern.matcher(bankAccNum);
            matching = matcher.find();
            boolean matching1;
            Pattern pattern1 = Pattern.compile("^\\d{4}$");
            Matcher matcher1 = pattern1.matcher(CVV2);
            matching1 = matcher1.find();
            boolean matching2;
            Pattern pattern2 = Pattern.compile("^\\d{4}$");
            Matcher matcher2 = pattern2.matcher(password);
            matching2 = matcher2.find();
            if (matching && matching1 && matching2) {
                Request request = new Request(customer, RequestType.ChargeCredit);
                request.setChargeCredit(money);
                RequestController.addRequest(request);
                System.out.println("your charging request is sent to admin.please wait a few second...");
                LogIn.adminLogIn();
                balance = false;
            }
        }
    }

    public static void completePurchase(Customer customer) {
        if (customer.getCarts() == null) {
            System.out.println("to complete your purchase you should add products to your carts first");
        } else {
            System.out.println("are you sure if you want to complete your purchase process?");
            System.out.println("if you say yes the product price will deducted from your credit balance!");
            System.out.println("1.yes" + "\n" + "2.no");
            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();
            if (answer == 1) {
                int help = CustomerController.completeThePurchase(customer);
                if (help == 0) {
                    System.out.println("your purchase was successful");
                }
                if (help == 1) {
                    System.out.println("your account balance is not enough!");
                }
            }
        }
    }

    public static void showPurchase() {
        Scanner scanner = new Scanner(System.in);
        boolean scoreBool = true;
        while (scoreBool) {
            System.out.println("please enter the product ID that you want to score and the score in order:");
            System.out.println("pay attention you can score the products from 0 to 5!");
            String ID = scanner.nextLine();
            double score = scanner.nextInt();
            if (score >= 0 && score <= 5) {
                String scoringResult = ProductController.score(ID, score);
                System.out.println(scoringResult);
                scoreBool=false;
            } else {
                System.out.println("the score you entered is not between 0 and 5!");
                System.out.println("do you want to try again?");
                System.out.println("1.yes 2.no");
                int answer = scanner.nextInt();
                if (answer == 2) {
                    scoreBool = false;
                }
            }
        }
    }
}
