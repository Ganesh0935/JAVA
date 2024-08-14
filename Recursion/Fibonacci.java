package ganesh.Recursion;

import java.math.*;

public class Fibonacci {
    public static void main(String[] args) {
       int num = fib(12);
        System.out.println("fibonacci number is "+ num);

//        for(int i = 0 ; i < 11 ; i++){
//            System.out.println(i+". "+fib(i));
//        }(

        // 1/5 = 0.2
        int n = 12 ;
        double phi = Math.sqrt(5);
        double number = phi*( (Math.pow(phi,n)) - (1-Math.pow(phi,n)) );

        double number1 = Math.pow(2,3);
        System.out.println((int)number + "is fibonnaci number");



    }

    public static int fib(int n){
        if(n < 2){
            return n;
        }
        return fib(n-1) + fib(n-2) ;
    }
}
