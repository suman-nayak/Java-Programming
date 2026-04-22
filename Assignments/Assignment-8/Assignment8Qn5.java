import java.util.*;
public class Assignment8Qn5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        for(int i = 0; i < 5; i++) {
            list.add(sc.next());
        }

        for(String s : list) {
            System.out.print(s + " ");
        }

        String front = sc.next();
        list.addFirst(front);
        System.out.println("\nAfter inserting at front:");
        for(String s : list) {
            System.out.print(s + " ");
        }

        String third = sc.next();
        list.add(2, third);
        System.out.println("\nAfter inserting at 3rd position:");
        for(String s : list) {
            System.out.print(s + " ");
        }

        String replace = sc.next();
        list.set(2, replace);
        System.out.println("\nAfter replacing 2nd index:");
        for(String s : list) {
            System.out.print(s + " ");
        }

        list.remove(4);
        System.out.println("\nAfter removing 4th index:");
        for(String s : list) {
            System.out.print(s + " ");
        }

        System.out.println("\nFirst element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        list.removeFirst();
        list.removeLast();
        System.out.println("After removing first and last:");
        for(String s : list) {
            System.out.print(s + " ");
        }
    }
}