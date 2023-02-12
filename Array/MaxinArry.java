import java.util.Arrays;

class MaxinArry{
    public static void main(String[] args) {
        int[] arr = {14, 45, 258, 65, 84};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end =arr.length-1;
        while( start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    // static int maxRange(int[] arr, int i, int j) {
    //     int maxValue = arr[i];
    //     for (int k = i; k <= j; k++) {
    //         if(arr[k] > maxValue){
    //             maxValue =arr[k];
    //         }
            
    //     }
    //     return maxValue;
    // }
}