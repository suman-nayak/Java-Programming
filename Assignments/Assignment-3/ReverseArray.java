//Write a Java program to find reverse an array without using a second array. Define a method void reverseArray(int arr[]) to perform the operation.
import java.util.Scanner;
class ReverseArray {
    public static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();

        int[] num = new int[size];
        System.out.println("Enter " + size + " Elements:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        reverseArray(num);
        System.out.print("Reversed Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + "\t");
        }
    }
}