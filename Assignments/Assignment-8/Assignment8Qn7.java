import java.util.*;
public class Assignment8Qn7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < 5; i++) {
            pq.add(sc.nextInt());
        }

        System.out.println("Priority Queue:");
        for(int x : pq) {
            System.out.print(x + " ");
        }

        System.out.println("\nHead element: " + pq.peek());

        System.out.println("Removed head: " + pq.poll());

        int num = sc.nextInt();
        pq.remove(num);

        System.out.println("After removing " + num + ":");
        for(int x : pq) {
            System.out.print(x + " ");
        }

        if(pq.contains(10)) {
            System.out.println("\nQueue contains 10");
        } else {
            System.out.println("\nQueue does not contain 10");
        }
    }
}