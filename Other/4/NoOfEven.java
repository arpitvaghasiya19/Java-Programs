public class NoOfEven {
    public static void main(String[] args) {

    }
    public int findNumbers(int[] nums) {
        int count = 0 ;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }

        return count;
    }

   boolean even(int num) {
        int digits = noOfDigit(num);
        if(digits % 2 == 0){
            return true;
        }
        return false;
    }
    int  noOfDigit(int num){
        return (int)(Math.log10(num)) +1;
    }
}
