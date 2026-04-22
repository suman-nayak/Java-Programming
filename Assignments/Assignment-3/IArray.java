//Write a Java program to store 10 numbers in an array and display them. Initialize the array at the runtime.
import java.util.Scanner;
class IArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter size of array:");
        size = sc.nextInt();
        int[] num = new int[size];

        System.out.println("Enter "+size+" numbers:");

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("The numbers you entered are:");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + "\t");
        }
    }
}