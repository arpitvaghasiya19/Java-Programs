import java.util.Objects;
import java.util.Scanner;

public class calculatorIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter operator : ");
        char o = sc.next().charAt(0);

        if(o == '+'){
            System.out.println(a+b);
        }else if(o == '-'){
            System.out.println(a-b);
        }else if(o == '*'){
            System.out.println(a*b);
        }else if(o == '/'){
            System.out.println(a/b);
        }else if(o == '%'){
            System.out.println(a%b);
        }
    }
}
