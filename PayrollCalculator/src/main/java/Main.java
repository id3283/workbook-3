import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileReader reader;
        try {
            reader = new FileReader("/Users/dave/pluralsight/DataFiles/employees.csv");
            String input;
            BufferedReader bufferedReader = new BufferedReader(reader);

            int lineIndex = 0;
            while ((input = bufferedReader.readLine()) != null) {
                String[] lineData = input.split("\\|");

                if (lineData[0].equals("id")) {
                    continue;
                }
                System.out.println(lineData);

                int id = Integer.parseInt(lineData[0]);
                String name = lineData[1];
                double hours = Double.parseDouble(lineData[2]);
                double rate = Double.parseDouble(lineData[3]);

                Employee newEmloyee = new Employee(id, name, hours, rate);
                System.out.println("ID: " + newEmloyee.getEmployeeId() );
            }
        } catch (Exception e) {
            System.err.println("There was a problem of some sort reading the file: " + e.getMessage());
        }



    }
}
