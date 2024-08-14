package ganesh.Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5,3,4,1,2} ;
        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertion(int[] arr) {
     //   int swap = 0;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = i+1 ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }
                else{
                    break;
                }
            }
        }

    }


    //TIME COMPLEXITY
    // Best case: O(N) // sorted
    // Worst case: O(N sqr) // oppositely sorted

    // Stable = YES
    // good in partially sorted array (smaller values of N)
    // used mostly in hybrid sorting

    //NO of swaps reduced compared to bubble sort
}
