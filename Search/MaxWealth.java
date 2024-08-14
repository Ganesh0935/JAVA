package ganesh.Search;

import java.util.Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] nums = {
                {1,5,7},
                {9,5,1}
        };
        int ans1 = wealth2(nums);
        System.out.println(ans1);

        int ans2 = wealth1(nums);
        //System.out.println(Arrays.toString(ans2));
        System.out.println(ans2);
    }
    static int wealth1(int[][] accounts){
        // person =row
        // account = col
        int ans = Integer.MIN_VALUE;

        for(int person = 0; person < accounts.length ; person++){
            int rowSum = 0;
            for(int account =0 ; account < accounts[person].length ;
            account++){
                // every col of each row
                rowSum+=accounts[person][account];
            }
            if(rowSum > ans){
                ans = rowSum;
             //   return new int[]{ans,person};
            }
        }
        return ans;
    }

    static int wealth2(int[][] accounts){
        // person =row
        // account = col
        int ans = Integer.MIN_VALUE;

        for(int person[] : accounts ){
            int Sum = 0;
            for(int acc : person){
                // every col of each row
                Sum+=acc;
            }
            if(Sum > ans){
                ans = Sum;
            }
        }
        return ans;
    }
}
