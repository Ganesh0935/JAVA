package ganesh;

// import ganesh.Recursion.Fibonacci;
import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time (in 12 hr format) :");
        int hour = input.nextInt();
        int minute = input.nextInt();

        double degree = ( (5.5*minute) - (30*hour) );
        if (degree < 0){
            degree = -1*degree ;
        }


//        int n = Fibonacci.fib(10);
//        System.out.println("n is "+n);
        System.out.println("Angle between them is "+ degree+"'");
        degree = 360 - degree ;
        System.out.println("Its Reflex angle is "+degree+"'");


    }
}



