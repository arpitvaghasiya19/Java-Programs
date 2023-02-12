import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {

        // int[][] arr = {
        //     {1, 2, 3},  //row0
        //     {4, 5},
        //     {6, 7, 8, 9}
        // };
        // System.out.println(arr[0][1]);
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);  //this will print length of row..

        //input
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row..
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();                
            }
        }
   
        //output
        // for (int row = 0; row < arr.length; row++) {
        //     //for each col in every row..
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col]+ " ");                
        //     }
        //     System.out.println();
        // }

        //output
        // for (int row = 0; row < arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // } 
        
        //output
        for( int[] a: arr ){
            System.out.println(Arrays.toString(a));
        }
    }
}
