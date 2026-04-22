import java.util.Scanner;
class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of A:");
        int A = sc.nextInt();
        System.out.println("Enter the Value of B:");
        int B = sc.nextInt();
        System.out.println("Enter the Value of C:");
        int C = sc.nextInt();
        System.out.println("Enter the Value of D:");
        int D = sc.nextInt();

        System.out.println("The Parameter of Ractangle is: "+(A+B+C+D));
    }
}
