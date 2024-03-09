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

       num.stream().sorted().forEach(System.out::println);
    // Sorting and printing with a space between each element
       num.stream().sorted().forEach(i -> System.out.print(i + " "));
System.out.println();
       //Minimum
      Integer integer =num.stream().min((x,y) -> x.compareTo(y)).get();
      System.out.println(integer);
      //Maximum
      Integer integer1 =num.stream().max((x,y) -> x.compareTo(y)).get();
      System.out.println(integer1);


      int sum = num.stream().reduce(0, (acc, num1) -> acc + num1); // Stream is consumed and cannot be used again
      System.out.println(sum);
      System.out.println(num);
    }
}
