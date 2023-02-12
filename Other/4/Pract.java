import java.util.ArrayList;
import java.util.Arrays;

public class Pract {
     public static void main(String[] args) {
//          int[][] arr  = {
//              {10, 20, 30, 40},
//              {15, 25, 35, 45},
//              {28, 29, 37, 49},
//              {33, 34, 38, 50}
//          };
//          System.out.println(Arrays.toString(search(arr, 37)));
//     }
//     static int[] search(int[][] arr, int target) {
//         int r = 0;
//         int c = arr.length - 1;

//         while(r < arr.length && c > 0){
//             if(arr[r][c] == target){
//                 return new int[]{r,c};
//             }

//             if(arr[r][c] < target){
//                 r++;
//             }else 
//                 c--;
//         }
//         return new int[]{-1, -1};
//     }

//      public int[] sortedSquares(int[] arr) {
//       ArrayList<Integer> list = new ArrayList<>();
//       for(int i = 0; i<arr.length; i++){
//        list.add(i*i);
//       }
       print(1);
     }
     static void print(int n){
      if(n == 5) return;
      System.out.println(n);
      print(n+1);
     }
 }