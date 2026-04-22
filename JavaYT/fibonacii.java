import java.util.Scanner;
public class fibonacii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of Range:");
        int num = sc.nextInt();
        fibo(num);
    }
    public static void fibo(int num){
        int num1 = 0, num2 = 1;
        if (num < 0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");
        while (num1 + num2 < num) {
            int num3 = num1 + num2;
            System.out.print(num3+" ");
            num1 = num2;
            num2 = num3;
        }
    }
}
