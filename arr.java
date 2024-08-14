package ganesh;
//import java.util.Scanner;
//public class arr{
//
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            int[] array = new int[5];
//            for (int j = 0; j < array.length; j++) {
//                array[j] = input.nextInt(); // Store input values into the array
//            }
//
//            for (int item : array) { // Declare the type of the variable in the enhanced for-loop
//                System.out.print(item);
//                System.out.println("is the element at position");
//            }
//        }
//
//}

import java.util.Scanner;
public class arr{
    public  static void main(String[] args){
        System.out.println("Meru mari Too Much andi Babu");

        //indirectly
        String[] arr; //ARRAY declaration
        arr=new String[5]; // array inialization, Here exactly object and memory created
        System.out.println(arr[0]); //for int array you will get 0
        //output is null (literal)
        arr[0]="What";
        arr[1]="Vision";

        //Direct initilized
        int[] nums={12,90,56,45,34};
        System.out.println(nums[2]);

        // 1.Heap mode
        // 2.Array is continuous location
        // 3.Array is dynamic memory allocation //Actually not continuous depends on JVM

        System.out.println(nums.length);

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }


        Scanner input = new Scanner(System.in);

        String[] array = new String[5];

        for(int j=0;j<array.length;j++){
            array[j]=input.next();
        }

        for(String item : array){
            System.out.print(item+" ");
        }
    }
}


