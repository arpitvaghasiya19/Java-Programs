public class Binary_SearchR {
    public static void main(String[] args) {
        int[] arr = {25, 45, 55, 65, 83, 99};
        int target = 99;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e){
        if( s > e ){
            return -1;
        }

        int m = s + (e - s) / 2;
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return search(arr, target, s, m -1);
        }
        else{
             return search(arr, target, m + 1, e);
        }
    }
}
