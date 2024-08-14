package ganesh.Sort;

import java.util.Arrays;

// Non-Comparison sorting technique eg: Count, radix/bucket , shell sorts
// fast Paced stable
// disadvantages : large numbers , decimals not works
public class CountSORT {
    public static void main(String[] args) {
       // int[] arr = {6,3,10,9,2,4,9,7} ;
        int[] arr = {4,3,3,2,1,4} ;
        count(arr);
        System.out.println(Arrays.toString(arr));

    }

    // Counting sort method
    static void count(int[] arr) {
        if(arr == null || arr.length <= 1){
            return ;
        }

        int max = arr[0] ;
        for(int num : arr){
            if(num > max){
                max = num ;
            }
        }

        int[] countArray = new int[max + 1] ;
        for(int num : arr){
            countArray[num]++;
        }

        int index = 0 ; // index = arr.length - 1
        for(int i = 0 ; i <= max ; i++){
            while(countArray[i] > 0){
                arr[index] = i ;
                index++ ; // index --
                countArray[i]--;
            }
        }

    }


}


