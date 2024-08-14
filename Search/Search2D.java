package ganesh.Search;

import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int[][] array={
                {2,4,5},
                {45,78,26,19},
                {90,47,39,62},
                {32,69,50}
        };
        int target = 47;
        int[] ans1 = Search(array,target);
        System.out.println(Arrays.toString(ans1));

        int ans2 = Max(array);
        System.out.println(ans2);

    }

    static int[] Search(int[][] arr,int target){

        for(int row=0 ; row < arr.length ; row++){
            for(int col=0 ; col < arr[row].length ; col++){
                if( arr[row][col] == target){
                    return new int[]{row,col};

                }
            }

        }
        return new int[]{-1,-1};
    }

    static int Max(int[][] array){
        int Max = Integer.MIN_VALUE;
        if(array.length==0){
            return Max;
        }
        for(int[] ints : array){
            for(int element : ints){
                if(element > Max){
                    Max = element;
                }
            }
        }
        return Max;
    }
}
