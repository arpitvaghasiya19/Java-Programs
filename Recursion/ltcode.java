class ltcode{
    public static void main(String[] args) {
        
    }

    static int pivotIndex(int[] arr){
        // for (int i = 0; i < arr.length - 1; i++) {
        //     for (int j = arr.length - 1; j > arr.length - i -1; j--) {
        //         Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
        //         Right sum = nums[4] + nums[5]
        //     }
        // }

        int sum = 0;
        for(int value : arr){
            sum = sum+ value;
        }
        int start = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
            if(start == sum){
                return i;
            }
            start = start + arr[i];
        }
        return -1;
    } 
}