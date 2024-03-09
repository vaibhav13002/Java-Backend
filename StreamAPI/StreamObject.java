package StreamAPI;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        // Stream<Object> emptyStream = Stream.empty();
        String[] names= { "Vaibhav", "Mishra","Bega" };

        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });
    }
}
