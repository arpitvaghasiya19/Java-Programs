import java.sql.SQLOutput;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("number you have entered is zero.");
        }else if(n %2 == 0){
            System.out.println("number is even");
        }else System.out.println("number is odd");
    }
}
