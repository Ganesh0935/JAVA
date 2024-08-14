package ganesh.Search;

public class LinearSearch{
    public static void main(String [] args){
        int[] nums = {21,45,85,39,20,77,56,39,2147483647};
        int target = 39;
        boolean ans1 = LinearSearch1(nums,target);
        int ans2 = LinearSearch2(nums,target);
        int ans3 = LinearSearch3(nums,target);
        System.out.println("The Element found:"+ans1+"\nits index is "+ans2);
        System.out.println("The element found that is "+ans3);

        int ans4 = LinearSearchRange(nums,target,4,8);
        System.out.println("The element found at "+ans4);

        int ans5 = Min(nums);
        System.out.println("Minimum value:"+ans5);
    }


    // Linear search function with boolean return value
    static boolean LinearSearch1(int[] array,int target){
        if(array.length == 0){
            return false;
        }

        for(int element : array){
            if(element == target){
                return true;
            }
        }
        return false;
    }

    // Linear search function finds element and return its index
    static int LinearSearch2(int[] array, int target){
        if(array.length == 0){
            return -1;
        }

        for(int index=0;index< array.length;index++){
            if(array[index] == target) {
                return index;
            }
        }
        return -1;
    }
    // Linear Search function finds element and returns the same if it found
    static int LinearSearch3(int[] array,int target){
        if(array.length == 0){
            return Integer.MAX_VALUE;
        }
        // for each loop
        for(int element : array) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    // Linear Search function finds element in range given
    static int LinearSearchRange(int [] array, int target,int start, int end){
        int length = array.length;
        if(length==0){
            return -1;
        }
        for(int index=start;index<end;index++){
            if(array[index]==target){
                return index;
            }
        }
        return -1;
    }
    // Min and Max among the elements
    static int Min(int[] array){
        int length=array.length;
        if(length==0){
            return -1;
        }
        int Min = array[0];
        for(int i=0;i<length;i++){
            if(array[i]<Min){
                Min=array[i];
                return Min;
            }
        }
    return Min;
    }


    // for small lists
    // for unsorted arrays
}
