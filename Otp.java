package ganesh;
import java.util.*;
import java.lang.String;

public class Otp {
    public static void main(String[] args) {
        Random input = new Random();
        int i = input.nextInt(0,10000); //(1000,10000)

        System.out.println(i < 1000 ? 1000 + i : i);  // ternary operator for if else statement

        // sout("password is "+numOtp(3)); gives improper output
        System.out.println(numOtp(6));

    }

    static char[] numOtp(int len){
        System.out.println("Your new password is:");

        String capital_chars = "ABCDEEFGHIJKLMNOPQRSTUVWXYZ";
        String small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()?";

        String values = capital_chars + small_chars + numbers + symbols;

        // Using random method
        Random random = new Random();
        char[] password = new char[len];
        for(int i=0;i<len;i++){
            // Use of charAt() method : to get character value
            // Use of nextInt() method : as it scans value as int
        password[i]=values.charAt(random.nextInt(values.length()))  ;
        }

        return password;
    }




}


