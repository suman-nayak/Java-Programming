import java.util.Scanner;

class DecimalToBinary {
    static String toBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();

        System.out.println("Binary = " + toBinary(n));
    }
}
