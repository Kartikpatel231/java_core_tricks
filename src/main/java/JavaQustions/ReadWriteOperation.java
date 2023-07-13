package JavaQustions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteOperation {

    public static void main(String[] args) {
        String fileName = "example.txt"; //file name
        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            //when we write (new FileWriter(fileName)), it means we are creating a
            // new FileWriter object that will be used to write data into a file
            // with the specified fileName.
            writer.write("Hello, world!");
            writer.newLine();
            writer.write("This is a sample text.");
            writer.newLine();
            System.out.println("Write to file successful.");

        }  catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
          }

        // Read from file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            //when we read (new FileReader(fileName)), it means we are creating a
            // new FileReader object that will be used to Read data from a file
            // with the specified fileName.
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            //Inside the while loop, reader.readLine() is used to read a line of text
            // from the file. This method returns a String containing the line of text
            // that was read. This line of text is then assigned to the variable line

        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
