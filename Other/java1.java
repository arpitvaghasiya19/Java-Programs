import java.util.Scanner;
public class java1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 2;
        while(n>c){
            if(n % c == 0){
                System.out.println("not prime");
                
            }
            c=c+1;
        }
        System.out.println("prime number");
        
    }
}