package ganesh.Search;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans1 = Even(nums);
        System.out.println("Total evenDigit numbers :"+ans1);
    }


    // to  count even digit numbers
    static int Even(int[] arr){
        int count=0;
        if(arr.length == 0){
            return -1;
        }
        for(int num : arr){
            if(findDigits(num)){
                count++;
            }
        }
        return count;
    }
    // to check even number of digits or not
    static boolean findDigits(int num){
//        if(digits(num)%2=0){
//            return true;
//        }
//        else{
//            return false;
//        }
        return (digits2(num))% 2 == 0;
    }

    // to find no of digits in number
    static int digits1(int num){
        if(num < 0){
            num = num*-1;
        }
        if(num == 0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num = num/10; // num/=10
        }
        return count;
    }

    // Find no of digits in number (Time Complexity is less)
    static int digits2(int num){
        return (int)(Math.log10(num))+1;
    }
}
