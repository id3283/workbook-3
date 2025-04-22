import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileReader reader;
        try {
            reader = new FileReader("/Users/dave/pluralsight/DataFiles/employee.csv");
            String input;
            BufferedReader bufferedReader = new BufferedReader(reader);

            Employee[] employees = new Employee[8];
            while ((input = bufferedReader.readLine()) != null) {
                String[] lineData = input.split("\\|");

            }
        } catch (Exception e) {
            System.err.println("There was a problem of some sort reading the file: " + e.getMessage());
        }


    }
}
