//Write a Java program to find largest number of an array. Define a method public int findMax(int nums[]), which will take an array as argument and return the largest number. Initialize the array at the runtime.
import java.util.Scanner;
class LargestArray {
    public static int findMax(int nums[]) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " Elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int maxElement = findMax(arr);
        System.out.println("Largest element in the array is: " + maxElement);
    }
}