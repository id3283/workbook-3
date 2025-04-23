import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        demoCollections();
    }

    private static void demoLocalDateStuff() {
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today is: " + today);
// Specify the date/time format you will want to use
        DateTimeFormatter fmt =
                DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");
        String formattedDate = today.format(fmt);
        System.out.println("Today is: " + formattedDate);


        String userInput;
        DateTimeFormatter formatter;
        userInput = "10/17/2022";
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate birthDay = LocalDate.parse(userInput, formatter);
    }

    private static void demoCollections() {
        String[] strings = new String[9];

        strings[3] = "hey";

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("a");
        myList.add("b");

        myList.set(0, "c");


    }
}
