/*Write a program to perform division of two number after taking both the number as
input from the user. Handle all the possible exceptions (/ by zero, number format etc)
and display suitable messages. */
import java.util.Scanner;

public class Assignment6Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter n1: ");
            String s1 = sc.nextLine();
            
            System.out.print("Enter n2: ");
            String s2 = sc.nextLine();
            
            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);
            
            int res = n1 / n2;
            System.out.println("Result: " + res);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            sc.close();
        }
    }
}