package Generics;

public class GenericClass {
    public static void main(String[] args) {
        // @SuppressWarnings({ "rawtypes", "unchecked" })
        Box<String> box = new Box<String>("My naam is Vaibhav");
  
        System.out.println(box.getValue());
        System.out.println(box.container.getClass().getName());
    }
}
// T means ki This is of T datatype jo bhi datatype object bana ke bhejengey o accept krlega a. 
class Box<T> {
    T container;

    public Box(T container) {
        this.container = container;
    }

    public Object getValue() {
        return this.container;
    }
}