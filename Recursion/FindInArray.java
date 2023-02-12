import java.util.ArrayList;

class FindInArray{
    public static void main(String[] args) {
        int[] arr = {2, 8, 6, 4, 6, 7, 9};
       // System.out.println(findAllIndex(arr, 6, 0,new ArrayList<>()));
        System.out.println(findAllindex2(arr, 6, 0));
    }

    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target ||find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr, target, index + 1);
    }


    static int findIndexLast(int[] arr, int target, int index){
        if(index == -1 ){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndexLast(arr, target, index - 1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllindex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        // this will contain ans for that function only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowcalls = findAllindex2(arr, target, index+1);
        
        list.addAll(ansFromBelowcalls);

        return list;
    }

}