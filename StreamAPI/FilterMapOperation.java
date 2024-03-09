package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class FilterMapOperation {
    public static void main(String[] args) {

    // eg of Filter
        List<String> names = List.of("Vaibhav", "Mishra","Ankit");
        List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

    // eg of Map
       List<Integer> num = List.of(2,5,7,9,44);
       List<Integer> NewNum = num.stream().map(i->i*i).collect(Collectors.toList());
       System.out.println(NewNum);
    }
}
