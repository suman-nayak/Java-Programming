/*Write a program to store some number into an array and display them. Declare an
integer array of size 5 in the main method. Ask the user for number of elements he/she
wants to store in the array. If number of elements is more than the size of array, throw
and handle ArraylndexOutOfBoundsException. Define a method insertlntoArray(int
a[], int size) to insert data into the array and make sure user is inserting integer data
only, otherwise handle the exception and display suitable message. */
import java.util.Scanner;

public class Assignment6Q2 {
    
    static void insertIntoArray(int[] a, int s) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < s; i++) {
            System.out.print("Enter element: ");
            try {
                a[i] = Integer.parseInt(sc.next());
            }
            catch (NumberFormatException e) {
                System.out.println("Error: Integer data only");
                i--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size: ");
        try {
            int n = Integer.parseInt(sc.next());
            
            if (n > a.length) {
                throw new ArrayIndexOutOfBoundsException("Limit exceeded");
            }
            
            insertIntoArray(a, n);
            
            System.out.print("Array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error: Invalid input");
        }
    }
}