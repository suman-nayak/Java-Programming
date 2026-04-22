import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter your second number:");
        int b = sc.nextInt();
        System.out.println("Before swapping: a = "+a+" b = "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping: a = "+a+" b = "+b);
    }
}