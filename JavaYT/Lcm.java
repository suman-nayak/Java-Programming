import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the 2nd number:");
        int num2 = sc.nextInt();

        common(num1, num2);
    }

    public static void common(int num1, int num2){
        for(int i = 1; i <= num2; i++){
            int factor = num1 * i;

            if(factor % num2 == 0){
                System.out.println("LCM is: " + factor);
                break;
            }
        }
    }
}