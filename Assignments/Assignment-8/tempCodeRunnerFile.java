import java.util.*;
public class Assignment8Qn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < 5; i++) {
            stack.push(sc.nextInt());
        }

        int popped = stack.pop();
        System.out.println("Popped element: " + popped);

        int num = sc.nextInt();
        if(stack.contains(num)) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }

        System.out.println("Top element: " + stack.peek());

        System.out.println("Final Stack:");
        for(int x : stack) {
            System.out.print(x + " ");
        }
    }
}