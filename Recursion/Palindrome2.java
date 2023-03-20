class Palindrome2{
    public static void main(String[] args) {
        
    }
   static int ans =0;
    static boolean isPalindromw(int n){
         int origi = n;

        if( n < 0 || n == 0){
            return false;
        }

        if(n > 0){
            // if(n%10 == n ){
            //     return true;
            // }
            int rem = n % 10;
            if(rem == 0){
                return false;
            }
            ans = ans*10  + rem;
            
        }
        if(ans == origi){
            return true;
        }
        return false;
    }
}