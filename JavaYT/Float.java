import java.util.Scanner;
class Float {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        float num1 = sc.nextFloat();

        System.out.println("Enter the 2nd Number:");
        float num2 = sc.nextFloat();

        System.out.println("The product is:"+(num1*num2));
    }
}
