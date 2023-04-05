
import view.Start;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean help3 = true;
        while (help3) {
            Start.start();
            System.out.println("do you want to close the program");
            System.out.println("1.yes 2.no");
            int answer = sc.nextInt();
            if (answer == 1) {
                help3 = false;
            }
        }
    }
}