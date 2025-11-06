package Exception_Handling;

import java.io.IOException;

public class Throw_Throws {
    static void checkFile() throws IOException {
        throw new IOException("File not found");
    }


    public static void main(String[] args) {
//        int age = 15;
//        if (age < 18) {
//            throw new ArithmeticException("Access denied you must be a 18 year old");
//        } else {
//            System.out.println("Welcome");
//        }

        try {
            checkFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}