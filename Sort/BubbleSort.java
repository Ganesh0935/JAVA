package ganesh.Sort;

import java.util.Arrays;

// Bubble Sort = Exchange Sort = Sinking sort
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubble(int[] arr) {
        boolean swapped; // to reduce iterations if arr is already sorted
     //   int swap=0;
        for(int i = 0 ; i < arr.length ; i++){
            swapped = false;
            for(int j = 1 ; j < arr.length - i ; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1] ;
                    arr[j-1] = temp ;
                    swapped = true;
                }
            }
            if(!swapped){
                return;
            }
        }

    }


    // Time complexity
    // Best case: O(N)  -> sorted
    // Worst case : O(N square)    -> sorted in opposite
    // As the size of arrays increases, no of comparisons also grows
    //Stable : YES

    // Space complexity = O(1)  // in plane sorting algorithm

}
