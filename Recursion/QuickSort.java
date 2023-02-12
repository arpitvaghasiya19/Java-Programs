
import java.util.Arrays;

class QuickSort{
    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 3, 5};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while(s <= e){
            while(s < pivot){
                s++;
            }

            while(e > pivot){
                e++;
            }

            if( s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;e--;
            }
        }
        sort(arr, low, e);
        sort(arr,s,high);

    }




    static void quicksort(int[] arr, int l, int r){
        if(l < r){
            int pi = partition(arr, l , r);

            quicksort(arr,l, pi-1);
            quicksort(arr, pi + 1 , r);
        }
    }

    static int partition(int[] arr, int l , int r){
        int  pivot = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }

    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}