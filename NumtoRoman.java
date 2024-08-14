package ganesh;

import java.util.Scanner;

public class NumtoRoman {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();


        try {

        String k=convertRoman(n);
        System.out.println("Roman Number is "+k);

        }catch(Exception e){
            System.out.println("cannot determiine "+ e.getMessage());

        }
        finally{
            System.out.println("Roman cant");
        }
    }

    public static String convertRoman(int num) {
        String [] ones= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String [] tens= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String [] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String [] thousands = {"","M","MM","MMM"};
    return thousands[(num%10000)/1000] + hundreds[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];
    }

}
