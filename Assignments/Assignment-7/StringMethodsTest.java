import java.util.Scanner;

public class StringMethodsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Length of string: " + str.length());

        if(str.length() > 4)
            System.out.println("Character at index 4: " + str.charAt(4));
        else
            System.out.println("String length is less than 5");

        System.out.println("First index of 'a': " + str.indexOf('a'));
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));

        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.print("Enter another string: ");
        String str2 = sc.nextLine();

        System.out.println("Case sensitive comparison: " + str.equals(str2));
        System.out.println("Case insensitive comparison: " + str.equalsIgnoreCase(str2));

        sc.close();
    }
}
