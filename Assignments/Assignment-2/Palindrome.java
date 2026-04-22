import java.util.Scanner;
class Palindrome {
    public boolean isPalindrome(int num) {
        int rev = 0, temp = num;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        Palindrome obj = new Palindrome();
        System.out.println(obj.isPalindrome(n));
    }
}

