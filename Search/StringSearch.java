package ganesh.Search;

public class StringSearch {
    public static void main(String[] args) {
        String rapper = "Michael Jackson";
        int length = rapper.length();
        System.out.println("The Length of the String is "+length);
        boolean ans1 = Search1(rapper,'l');
        System.out.println("Element found in String:"+ans1);
        int ans2 = Search2(rapper,'c');
        System.out.println("Your element found at "+ans2);
        char ans3 = Search3(rapper,'q');
        System.out.println("Your element is "+ans3);

        int ans4 = SearchRange(rapper,'c',5,15);
        System.out.println("second c is located at index:"+ans4);


    }

    static boolean Search1(String name,char target){
        int len = name.length();
        if(len == 0){
            return false;
        }
        char[] arr = name.toCharArray();
        for(char k : arr){
            if(k==target){
                return true;
            }

    }
    return false;
    }


    static int Search2(String name,char target){
        int len = name.length();
        if(len == 0){
            return -1;
        }
        char[] arr = name.toCharArray();
        for(int i=0;i<len;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    static char Search3(String name,char target){
        int len = name.length();
        if(len == 0){
            return Character.MAX_VALUE;
        }
        char[] arr = name.toCharArray();
        for(int k : arr){
            if(k==target){
                return target;
            }
        }
        return Character.MAX_VALUE;
    }

    static int SearchRange(String name,char target,int start,int end){
        int length = name.length();
        char[] arr = name.toCharArray();
        if(length==0)
            return -1;
        for(int index=start; index < end;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
    
    
}
