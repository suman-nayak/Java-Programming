import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        Arm(num);
    }
    public static void Arm(int num) {
        int num1 = num;
        int rem, sum = 0;

        while (num1 != 0) {
            rem = num1 % 10;
            sum = sum + (rem * rem * rem);
            num1 = num1 / 10;
        }
        if (sum == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}