package ganesh;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Date1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();

        LocalDate date = LocalDate.parse(inputDate);

        System.out.println(date); // prints the date

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day of the week is: " + dayOfWeek);
    }
}

