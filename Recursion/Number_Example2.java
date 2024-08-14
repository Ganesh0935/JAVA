package ganesh.Recursion;


public class Number_Example2{
    public static void main(String[] args) {
        // write a function that takes the number and prints
        // prints first 4 numbers 1 2 3 4

       // print(1);
        print1(1,5);

    }

    static void print(int n){
        // base condition
        if( n == 5){
             return;
        }
        System.out.println(n);
        // recursive call
        print(n+1);
    }

    static void print1(int n , int m){
       if( n <= m) {
           System.out.println(n);
           print1(n+1,m);
       }
    }


    // infinite loop Stack overflow
//    static void print2(int n){
//        System.out.println(n);
//        print2(n+1);
//    }





}

// Very Very Important Rules
// when the function is not finished executing, it will remain in stack.
// when a function is finished executing, it will be removed from the stack. Flow of program is continued.
// Base Condition: the condition where recalling of function ends

// recursive call
// if function calls again and again, you can treat it as separate call in the stack
// separate memory is allocated. NO base condition -> leads to infinite loop (or) memory exceeds. This is Stack Overflow Error






// WHY RECURSION ?
// ans. ->It helps us in solving bigger/ complex problems in a simple way
//  -> you can convert recursion soln into iteration vice versa
// -> Space complexity is not constant becoz of recursive cells
// -> It helps us in breaking bigger into smaller problems



// Visualizing Recursion