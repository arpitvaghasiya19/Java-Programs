public class Order_ag_BinaryS {
   public static void main(String[] args) {
        // int[] arr = {10, 16, 18, 20, 25, 29, 35, 37};
        int[]  arr = {99, 88, 65, 56, 54, 51, 35, 24, 22, 11 };
        int target = 88;
        int ans = binary_search(arr, target);
        System.out.println(ans); 
    
   } 

   static int binary_search(int[] arr, int target){
    int start = 0;
    int end = arr.length - 1;

    // finding that array is sorted in which sequence
    boolean isAsc;
    if(arr[start] < arr[end]){
        isAsc = true;
    }
    else isAsc= false;

    //Or
    // boolean isAsc = arr[start] < arr[end];

    while(start <= end){

        int mid = start + (end - start) / 2 ;

        if(target == arr[mid]){
            return mid;
        }

        if(isAsc){
            if(target < arr[mid]){
            end = mid - 1;
            }
            else{
                start = mid + 1 ;
            }
        }
        else{
            if(target > arr[mid]){
                end = mid - 1;
                }
                else{
                    start = mid + 1 ;
                }
        }
    }
    return -1;
    }
}
