

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 3, 2, 4 };
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int unique =0;

        for(int n : arr){ // read as for every number in arr
            unique ^= n;    // this is x-or ing...
        }

        return unique;
    }
}
