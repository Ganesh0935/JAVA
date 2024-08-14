package ganesh;

import java.util.Scanner;

public class Date {

    public static void main(String[] args) {
        System.out.println("Enter the date (DD/MM/YYYY):");
        Scanner input= new Scanner(System.in);
        int dat = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();

       // String n = monthCode(month);
        int n = monthCode(month);
        int m = yearCode(year);

        int year1=year%100;

        int div = year1/4;

        int sum = dat + n + m + div + year1 ;
        int outPut;
        outPut = sum%7;
        // checking for leap year
        if(year%4==0 && year%100!=0 || year%400==0) {
            if (month <= 2) {
                outPut = outPut - 1;
            }
        }

        //System.out.println(sum);
        String k = day(outPut);
        System.out.printf("Day of the week on %d/%d/%d is %s",dat,month,year,k);
//        System.out.println("Day of the week on"+dat+"/"+"" + k);
    }

    public static int monthCode(int num){
        //String [] mont = {"","0","3","3","6","1","4","6","2","5","0","3","5"};
        int [] mont= {0,0,3,3,6,1,4,6,2,5,0,3,5};
        return mont[num];
    }

    public static int yearCode(int number){ /// String num = Integer.toString(number);
       /// num = num[0] + num[1];
       // int choice = Integer.parseInt(num);

        int num = (number/100);
        int choice = num%4;
        switch (choice) {
            case 0 -> {
                return 6;
            }
            case 1 -> {
                return 4;
            }
            case 2 -> {
                return 2;
            }
            case 3 -> {
                return 0;
            }
            default -> {
                return -1;
            }
        }

///       if(number%4 == 0) return 6;
//        else if (number >= 1700 && number <=1799){
//            return 4;
//        }
//        else if (number >= 1800 && number <=1899){
//            return 2;
//        }
//        else if (number >= 1900 && number <=1999){
//            return 0;
//        }
//        else{
//            return 6;
//        }
    }

    public static String day(int x){
        String [] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        return days[x];
    }

}
