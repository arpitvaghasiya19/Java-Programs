class MissingPositive{
    public static void main(String[] args) {
        int[] num = {1, 2, 0};
        System.out.println(FirsrmissingPositive(num)); 
    }

    static int FirsrmissingPositive(int[] num){
        int i = 0;
        while(i < num.length){
            int correct = num[i] - 1;
                if(num[i] >0 && num[i] <= num.length && num[i] != num[correct]){
                    swap(num, i, correct);
                }else{
                    i++;
                }
        }

        //search for first missing number..
        for (int index = 0; index < num.length; index++) {
            if(num[index] != index +1){
                return index + 1;
            }
        }
        return num.length + 1;
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}