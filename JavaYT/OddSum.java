import java.util.Scanner;
public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number (up to) you want to add:");
        int num = sc.nextInt();
        odd(num);
    }
    public static void odd(int num){
        int sum = 0;
        for(int i = 1; i <= num; i = i+2){
            sum = sum + i;
        }
        System.out.println("The sum is:"+sum);
    }
}
