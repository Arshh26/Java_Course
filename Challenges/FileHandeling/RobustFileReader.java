package FileHandeling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter your file name: ");
        String fileName = input.next();

        try(FileReader reader = new FileReader(fileName)) {
            int read;
            while ((read = reader.read()) != -1){
                System.out.println((char)read);
            }
        } catch (IOException exception) {
            System.out.printf("Exception occured: %s",exception.getMessage());

        }
    }
}
