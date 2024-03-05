package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OLDvsNEW {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,7,6);
        //Without Stream old method
        List<Integer> listEven = new ArrayList<>();
        for(Integer i : list){
            if(i%2 == 0){
                listEven.add(i);
            }
        }
        // System.out.println(list);
        // System.out.println(listEven);

        // New Method using Stream
        Stream<Integer> str = list.stream();
        List<Integer> newList = str.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);
        
    }
}
