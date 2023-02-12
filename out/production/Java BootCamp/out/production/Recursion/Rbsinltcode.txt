class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid;
        while(left<=right){
            mid = left+(right-left)/2;
            if(nums[mid] == target) return mid;
            // condition for left side is sort
            if(nums[left]<=nums[mid]){
                if(target>=nums[left] && target <=nums[mid]){
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }
            else{
                if(target>=nums[mid] && target <=nums[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
    }
     return -1;   
    }
}
    
   

//     static int search1(int[] arr, int target, int s, int e){
//         if(s > e){
//             return -1;
//         }

//         int m = s + (e - s) / 2;
//         if(arr[m] == target){
//             return m;
//         }

//         if(arr[s] <= arr[m]){
//             if(target >= arr[s] && target <= arr[m]){
//                 return search1(arr, target, s, m - 1);
//             }else {
//                 return search1(arr, target, m + 1, e);
//             }
//         }

//         if(target >= arr[m] && target <= arr[e]){
//             return search1(arr, target, m + 1 , e);
//         }
//         return search1(arr, target, s, m - 1);
//     }

