import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        pra(num);
    }

    public static void pra(int num){
        int count = 0;

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                count++;
            }
        }

        if (count == 0 && num > 1)
            System.out.println("It is prime number");
        else
            System.out.println("It is not prime number");
    }
}