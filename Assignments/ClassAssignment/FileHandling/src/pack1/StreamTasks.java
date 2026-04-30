package pack1;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTasks {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

        List<Integer> squaredNumbers = numbers.stream()
                                              .map(n -> n * n)
                                              .collect(Collectors.toList());
        System.out.println(squaredNumbers);

        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}