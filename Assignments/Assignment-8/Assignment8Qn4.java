import java.util.*;

public class Assignment8Qn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        boolean balanced = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } 
            else if (ch == ')') {
                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            balanced = false;
        }

        if (balanced) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}