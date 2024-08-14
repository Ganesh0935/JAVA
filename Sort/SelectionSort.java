package ganesh.Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
     int[] nums = {4,5,1,2,3};
     selectionSort(nums);
     System.out.println(Arrays.toString(nums));
    }

    // Selection sort method
    static void selectionSort(int[] arr){
        for(int i =0;i< arr.length ; i++){
            // find max int in arr and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);

            swap(arr,last,maxIndex);
        }
    }

    // Swap the numbers
     static void swap(int[] arr,int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // to get Max index value of the array
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start ; i <= end ; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    // Best case : O(N sqr)
    // Worst case: O(N sqr)
    // Stable = NO
    // Stability only in Bubble, Insertion,


    // It performs well on small lists/arrays

}
