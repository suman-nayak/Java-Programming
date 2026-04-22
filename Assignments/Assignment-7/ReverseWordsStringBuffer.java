import java.util.Scanner;
public class ReverseWordsStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        String result = "";

        for(int i = 0; i < words.length; i++) {
            StringBuffer sb = new StringBuffer(words[i]);
            result = result + sb.reverse().toString() + " ";
        }

        System.out.println(result.trim());

        sc.close();
    }
}