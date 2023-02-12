public class findingthedupli {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3 , 2, 6, 5};
        System.out.println(finding(arr));
    }

    static int finding(int[] arr){
        int i = 0;
        while(i < arr.length ){
            int correct = arr[i]- 1; //if array starts from o then -1 will not be req.
            if(arr[i] != arr[correct]){
            swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                return arr[index];
            }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
