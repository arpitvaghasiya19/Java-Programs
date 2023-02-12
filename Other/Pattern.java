class Pattern{
    public static void main(String[] args) {
        pattern8(3);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n ; col++){
                System.out.print("* ");
           }
           System.out.println();
        }
    }


    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++){
                System.out.print("* ");
           }
           System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row ; col--){ //for(int col =1; col <=n+1-row; col++){
                System.out.print("* ");
           }
           System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++){
                System.out.print(col +" ");
           }
           System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int TotalColsInRow = row > n ? 2 * n -row : row; 
            for (int col = 0; col < TotalColsInRow ; col++){
                System.out.print("* ");
           }
           System.out.println();
        }
    }

    //Diamond
    static void pattern6(int n){
        for (int row = 0; row < 2*n; row++) {
           // // int noOfSpaces = row <= n ? n- row : row - n;
            int TotalColsInRow = row > n ? 2 * n -row : row;
            int noOfSpaces = n - TotalColsInRow; 
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < TotalColsInRow ; col++){
                System.out.print("* ");
            }
           System.out.println();
        }
    }

    //piramid of numbers
    static void pattern7(int n){
       for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print( "  ");
            }

            for (int col = row; col >=1 ; col--) {
                System.out.print(col + " ");
            }
            
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
           System.out.println();
        }
    }

    static void pattern8(int n){
        int original = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
            
            int atEveryIndex1 = original- Math.min(Math.min(row, col), Math.min(n-row,n-col));
            if(atEveryIndex1 > 0){

            
            System.out.print(atEveryIndex1 + " ");
            }     
            }
            System.out.println();
        }

    }

}