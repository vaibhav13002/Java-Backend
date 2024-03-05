package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class ArrayListDefine {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        List<String> names = Arrays.asList("John", "Peter", "Alice", "Mary");
        // names.add("Vaibhav");  // String is inMutable changes are not allowed
        @SuppressWarnings("unused")
        List<Integer> li = List.of(1, 2, 3, 4, 5);
        // li.add(8); // String is inMutable changes are not allowed

        List<String> fruits = List.of("apple", "banana", "orange");
        fruits.forEach(System.out::println);

        // Trying to modify the list will throw an exception
        // fruits.add("grape"); // UnsupportedOperationException

        String[] colors = new String[] { "red", "green", "blue" };
        List<String> colorList = Arrays.asList(colors);
        colorList.set(0, "bega");
        // colorList.add(0,"Mishra");  // not supported
        // colorList.remove(0);
    

        colorList.add("purple"); // Modifies the list and the underlying array   // String is inMutable changes are not allowed
        System.out.println(colorList); // Output: [red, green, blue, purple]
        System.out.println(Arrays.toString(colors)); // Output: [red, green, blue, purple] (modified array)

    }

}
