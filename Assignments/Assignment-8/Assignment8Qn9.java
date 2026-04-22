import java.util.*;
public class Assignment8Qn9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();

        for(int i = 0; i < 5; i++) {
            int roll = sc.nextInt();
            String name = sc.next();
            map.put(roll, name);
        }

        System.out.println("Student Details:");
        for(Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        int roll = sc.nextInt();
        String name = sc.next();
        map.put(roll, name);

        System.out.println("After adding one student:");
        for(Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        ArrayList<Integer> rolls = new ArrayList<>(map.keySet());
        System.out.println("Roll Numbers:");
        for(int r : rolls) {
            System.out.print(r + " ");
        }

        System.out.println("\nStudent Names:");
        for(String n : map.values()) {
            System.out.print(n + " ");
        }

        String search = sc.next();
        boolean found = false;
        for(String n : map.values()) {
            if(n.equals(search)) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("\nStudent found");
        } else {
            System.out.println("\nStudent not found");
        }

        int updateRoll = sc.nextInt();
        String newName = sc.next();
        if(map.containsKey(updateRoll)) {
            map.put(updateRoll, newName);
        }

        System.out.println("After update:");
        for(Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        int removeRoll = sc.nextInt();
        map.remove(removeRoll);

        System.out.println("After removal:");
        for(Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}