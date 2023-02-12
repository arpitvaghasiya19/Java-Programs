public class Factorial {
    public static void main(String[] args) {
        long ans = fact(4);
        System.out.println(ans);
    }

    static long fact(long n){
        if( n == 1){
            return 1;
        }
       return  n * fact(n - 1);
    }
}
