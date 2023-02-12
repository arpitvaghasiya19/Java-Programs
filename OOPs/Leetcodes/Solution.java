package Leetcodes;

<<<<<<< HEAD

import java.util.Collections;
import java.util.List;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i <= nums.length - 1; i ++){
            int last = nums.length -i - 1;
            while(i < last){
                if(nums[i] + nums[last] == target){
                    return new int[]{i,last};
                }
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}








//class Solution {
//    public int rob(int[] nums) {
//        if(nums.length == 0){
//            return 0;
//        }
//
//        int v2 = 0;
//        int v1 = 0;
//
//        for(int num : nums){
//            int temp = v2;
//            v2 = Math.max(v1 + num, v2);
//            v1 = temp;
//        }
//        return v2;
//    }
//    //     return robb(nums, nums.length -1);
//    // }
//
//    // int robb(int[] nums, int i){
//    //     if(i < 0){
//    //         return 0;
//    //     }
//    //     return Math.max((robb(nums,i-2) + nums[i]),robb(nums,i-1));
//    // }
//}


/* triangle*/
//class Solution {
//    public int minimumTotal(List<List<Integer>> triangle) {
//        int sum = 0;
//        for(List<Integer> list : triangle){
//            int minIndex = list.indexOf(Collections.min(list));
//            sum = sum + list.get(minIndex);
//        }
//        return sum;
//    }
//
//}
=======
class Solution {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("AB","ABAB"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int a = str1.length();
        int b = str2.length();

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp; 
        }
        return str2.substring(0,a);
    }
}
>>>>>>> 94c3593 (java)
