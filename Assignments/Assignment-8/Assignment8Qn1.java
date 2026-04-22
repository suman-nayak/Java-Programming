import java.util.*;
public class Assignment8Qn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 10 numbers:");
        for(int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Using for loop:");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\nUsing for-each loop:");
        for(int x : list) {
            System.out.print(x + " ");
        }

        System.out.println("\nUsing Iterator:");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        list.set(4, 100);
        System.out.println("\nAfter updating 4th index to 100:");
        for(int x : list) {
            System.out.print(x + " ");
        }

        list.add(6, 500);
        System.out.println("\nAfter inserting 500 at 6th index:");
        for(int x : list) {
            System.out.print(x + " ");
        }

        list.remove(2);
        System.out.println("\nAfter removing 2nd index:");
        for(int x : list) {
            System.out.print(x + " ");
        }

        list.remove(Integer.valueOf(100));
        System.out.println("\nAfter removing 100:");
        for(int x : list) {
            System.out.print(x + " ");
        }

        System.out.println("\nIndex of 500: " + list.indexOf(500));

        Collections.sort(list);
        System.out.println("Ascending order:");
        for(int x : list) {
            System.out.print(x + " ");
        }

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("\nDescending order:");
        for(int x : list) {
            System.out.print(x + " ");
        }

        System.out.println("\nEnter k:");
        int k = sc.nextInt();
        if(k > 0 && k <= list.size()) {
            Collections.sort(list, Collections.reverseOrder());
            System.out.println(k + "th largest element: " + list.get(k - 1));
        } else {
            System.out.println("Invalid k");
        }
    }
}