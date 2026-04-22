import java.util.*;
public class Assignment8Qn11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < 5; i++) {
            set.add(sc.next());
        }

        String check = sc.next();
        if(set.contains(check)) {
            System.out.println("Student exists");
        } else {
            System.out.println("Student does not exist");
        }

        System.out.println("All Students:");
        for(String s : set) {
            System.out.print(s + " ");
        }

        String remove = sc.next();
        set.remove(remove);

        System.out.println("\nAfter removal:");
        for(String s : set) {
            System.out.print(s + " ");
        }
    }
}