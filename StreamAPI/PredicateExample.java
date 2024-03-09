package StreamAPI;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
                // Example of a predicate using a lambda expression
                Predicate<Integer> isEven = num -> num % 2 == 0;

                System.out.println(isEven.test(4));  // Output: true
                System.out.println(isEven.test(7));  // Output: false
    }
}
