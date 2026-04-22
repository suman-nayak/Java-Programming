import java.util.Scanner;

public class StringBufferOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string (length > 15): ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);

        sb.append(" NEWSTRING");
        System.out.println("After concatenation: " + sb);

        sb.insert(4, "ABCD");
        System.out.println("After insertion: " + sb);

        sb.delete(10, 14);
        System.out.println("After deletion: " + sb);

        int index = sb.indexOf("ABCD");
        if(index != -1)
            sb.replace(index, index + 4, "WXYZ");

        System.out.println("After replace: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        sc.close();
    }
}