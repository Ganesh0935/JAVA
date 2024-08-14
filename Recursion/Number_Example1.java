package ganesh.Recursion;

public class Number_Example1{
    public static void main(String[] args) {
        // write a function that takes the number and prints
        // prints first 4 numbers 1 2 3 4
        print1(1);

    }

    static void print1(int n){
        System.out.println(n);
        print2(2);
    }

    private static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    private static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    private static void print4(int n) {
        System.out.println(n);
    }
}

// Very Very Important Rules
// when the function is not finished executing, it will remain in stack.
// when a function is finished executing, it will be removed from the stack. Flow of program is continued.