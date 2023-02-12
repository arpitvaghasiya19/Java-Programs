import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle p: ");
        int p = sc.nextInt();
        System.out.print("Enter rate r: ");
        int r = sc.nextInt();
        System.out.print("Enter time t: ");
        int t = sc.nextInt();
        int A = p*(1 + r*t);
        System.out.println("Simple Interest is " + A);
    }
}
