import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        String n = sc.next();
        System.out.println("Hello and Wel-come dear " + n);
    }
}
