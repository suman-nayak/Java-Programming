/*Create a custom exception class called InvalidAgeException. Write a program that
prompts the user to enter their age. If the age is less than 0 or greater than 120, throw
an InvalidAgeException. */
import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String m) {
        super(m);
    }
}

public class Assignment6Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter age: ");
        
        try {
            int a = s.nextInt();
            if (a < 0 || a > 120) {
                throw new InvalidAgeException("Age out of bounds");
            }
            System.out.println("Valid age: " + a);
        }
        catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error: Invalid input");
        }
    }
}