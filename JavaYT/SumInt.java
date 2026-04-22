import java.util.Scanner;

public class SumInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        integer(num);
    }
    public static void integer(int num){
        int sum = 0, rem;
        while (num != 0){
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("The sum is:"+sum);
    }
}