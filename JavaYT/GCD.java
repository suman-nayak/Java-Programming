import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the 2nd number:");
        int num2 = sc.nextInt();

        common(num1, num2);
    }
    public static void common(int num1, int num2) {
        int least = (num1 < num2)? num1:num2;
        int gcd = 1;
        for (int i = 2; i <= least; i++){
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
        System.out.println("GCD of the number:"+gcd);
    }
}