import java.util.Arrays;
import java.util.Scanner;

class Linear_Search{
    public static void main(String[] args) {
        int[] arr = {13, 34, 45, 76, 87, 16, 21};
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the target value: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int ans = linear(arr,target);
        System.out.println(ans);
    }

    static int linear(int[] arr,int target){
        if(arr.length ==0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int cur = arr[index];
            if(cur == target){
                return index;
            }            
        }
        return -1;
    }
}