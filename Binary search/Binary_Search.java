class Binary_Search{
    public static void main(String[] args) {
        int[] arr = {10, 16, 18, 20, 25, 29, 35, 37};
        int target = 35;
        int ans = binary_search(arr, target);
        System.out.println(ans); 
        
    }

    static int binary_search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2 ;
            if(target == arr[mid]){
                return mid;
            } 
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1 ;
            }
        }
        return -1;
    }
}