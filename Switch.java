package ganesh;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
    //    System.out.println("Enter movie:");
    //   String movie= input.next(); // switch expression type and case type are same

//        //old style switch expression
//        switch (movie) {
//            default:
//                System.out.println("Enter valid movie");
//                break;
//            case "bahubali":
//                System.out.println("Telugu movie");
//                break;
//            case "kgf":
//                System.out.println("Kannada movie");
//                break;
//            case "sairat":
//                System.out.println("Marathi movie");
//                break;
//            case "vikram":
//                System.out.println("Tamil movie");
//                break;
//            case "dangal":
//                System.out.println("Hindi movie");
//                break;


//       //enhanced switch expression
//        switch (movie) {
//            case "bahubali" -> System.out.println("Telugu movie");
//            case "kgf" -> System.out.println("Kannada movie");
//            case "sairat" -> System.out.println("Marathi movie");
//            case "vikram" -> System.out.println("Tamil movie");
//            case "dangal" -> System.out.println("Hindi movie");
//            default -> System.out.println("Enter valid movie");


//        // push down switch expression
//        System.out.println(switch (movie) {
//            case "bahubali" -> "Telugu movie";
//            case "kgf" -> "Kannada movie";
//            case "sairat" -> "Marathi movie";
//            case "vikram" -> "Tamil movie";
//            case "dangal" -> "Hindi movie";
//            default -> "Enter valid movie";
//        });



        System.out.println("Enter the day(no):");
        int day = input.nextByte();
// pushdown switch
//        System.out.println(switch (day) {
//            case 1,2,3,4,5 -> "WEEKDAY";
//            case 6,7 -> "WEEKEND";
//            default -> "Invalid";
//        });


// enhanced switch statement
        switch (day) {
            case 1,2,3,4,5 -> System.out.println("WEEKDAY");
            case 6,7 -> System.out.println("WEEKEND");
            default -> System.out.println("INVALID ENTRY");
        }

// normal switch
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("WEEKDAY");
//                break;
//            case 6:
//            case 7:
//                System.out.println("WEEKEND");
//                break;
//            default:
//                System.out.println("INVALID ENTRY");
//                break;
//        }
    }
}
