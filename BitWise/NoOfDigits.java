class NoOfDigits{
    public static void main(String[] args) {
        int n = 5;

      
        int base = 2;
         
        int ans = (int)(Math.log(n) / Math.log(base)) + 1;
        System.out.println(ans);

/* for finding no of 1 in number then use n &(n-1) with having loop as well ...*/
    }
}