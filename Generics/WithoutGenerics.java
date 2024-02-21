package Generics;

import java.util.ArrayList;

public class WithoutGenerics {

    @SuppressWarnings({ "rawtypes", "unchecked" }) // vaise tho warning aarha h to add generic but we had suppressed 
    public static void main(String[] args) {
        
        
        ArrayList list = new ArrayList<>();
        list.add(5);
        list.add("vaibhav");

        String s = (String)list.get(1);
        System.out.println(s);
    }
}
