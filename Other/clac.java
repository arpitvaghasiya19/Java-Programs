import java.util.Scanner;

public class clac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = 0;
        System.out.println("Enter operator: ");
        String opr = sc.next();
        switch(opr){

            case "+" :
                ans = num1 + num2;
                System.out.println(ans);
                break;
        
            case "-" :
                ans = num1 - num2;
                System.out.println(ans);
                 break;
            
            case "*" :
                 ans = num1 * num2;
                 System.out.println(ans);
                 break;

            case "/" :
                ans = num1 / num2;
                System.out.println(ans);
                 break;

            case "%" :
                 ans = num1 % num2;
                 System.out.println(ans);
                 break;
            
            default:System.out.println("please enter valid operation !!");
        }
    }
}
 