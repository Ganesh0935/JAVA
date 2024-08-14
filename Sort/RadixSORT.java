package ganesh.Sort;

import java.util.Arrays;

//
//// bucket sort
//public class RadixSORT{
//
//    static void radix(int[] arr) {
//        int max = Arrays.stream(arr).max().getAsInt();
//
//        // do count sort for every digit place
//        for(int exp = 1 ; max /exp > 0 ; exp*= 10 ){
//            countSort(arr,exp);
//        }
//    }
//
//    static void countSort(int[] arr, int exp) {
//        int n = arr.length;
//        int[] output = new int[n] ;
//        int[] count = new int[10] ;
//
//        Arrays.fill(count,0);
//
//        for(int i = 0 ; i < n ; i++){
//            count[ (arr[i] / exp) % 10 ]++ ;
//        }
//
//        System.out.println("Count array for "+ exp + " : "+ Arrays.toString(count));
//
//        for(int i = 0 ; i < 10 ; i++){
//            count[i] = count[i] + count[i-1] ;
//        }
//        System.out.println("Updated Count array "+ Arrays.toString(count));
//
//        for(int i = n-1 ; i>=0 ; i--){
//            output[count[(arr[i]/exp)%10]-1] = arr[i];
//            count[(arr[i]/exp)%10]--;
//        }
//
//        System.arraycopy(output,0,arr,0,n);
//
//    }
//    public static void main(String[] args) {
//        //   int[] nums = {6,5,4,2,13,5,1} ;
//        int[] nums = {29,83,471,36,91,8} ;
//
//        //   System.out.println("Origin array: "+ Arrays.toString(nums));
//        radix(nums);
//        System.out.println("Sorted array: "+ Arrays.toString(nums));
//
//    }
//
//
//}






// Radix sort = bucket sort


public class RadixSORT {
    public static void main(String[] args) {
        // int[] arr = {6,3,10,9,2,4,9,7} ;
        //int[] arr = {4,3,3,2,1,4} ;
        int[] arr = {170,45,75,90,802,24,2,66};
        radix(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void radix(int[] arr){
        int m = getMax(arr);
        for(int exp =1; m/exp > 0 ; exp *= 10){
            count(arr);
        }
    }

    static int getMax(int[] arr) {
        int max = arr[0] ;
        for(int num : arr){
            if(num > max){
                max = num ;
            }
        }
        return max;
    }

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


