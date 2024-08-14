package ganesh.Search;
import java.lang.instrument.*;

public class BinarySearch {
    public static void main(String[] args) {
         int[] nums = {2,4,6,34,65,78,89,90,92,93,97,99};
        // int[] nums = {99,98,97,95,94,93,92,91,69,65,63,62,61};
        int target=65;
        int ans1 = Search1(nums,target);
        System.out.println(ans1);
    }

    static int Search1(int[] array,int target){
        // return the index
        // return -1 if it does not exist
        int start = 0;
        int end = array.length - 1;


        boolean Ask;
        Ask = array[start] <= array[end] ;
// /       if(array[start] <= array[end]){
//            Ask = true;
//        }
//        else{
//            Ask = false;
//        }

while(start <= end) {
    int mid = start + (end - start)/2;

    if(target == array[mid]){
        return mid;
    }

    if(Ask){
        if (target < array[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    else{
        if (target > array[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
}
return -1;
    }




    // for larger lists
    // only works on sorted arrays
    // time complexity is O(logN)
}
