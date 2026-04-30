package pack1;

import java.util.function.*;

public class LambdaTasks {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        
        Predicate<Integer> isEven = n -> n % 2 == 0;
        
        System.out.println(add.apply(10, 15));
        System.out.println(isEven.test(10));
    }
}
