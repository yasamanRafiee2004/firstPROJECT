package view;
import java.util.Scanner;
public class SignUp {
   String email;
   String password;

   public void print(){
       Scanner input = new Scanner(System.in);
       System.out.println("please enter an email");
       email = input.nextLine();
       System.out.println("please enter an password");
       password = input.nextLine();

   }
   public SignUp(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
