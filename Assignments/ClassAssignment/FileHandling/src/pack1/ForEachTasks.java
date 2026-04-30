package pack1;
import java.util.*;

public class ForEachTasks {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Rahul", "Sneha");

        names.forEach(name -> System.out.println(name));

        names.forEach(name -> System.out.println(name.toUpperCase()));
    }
}