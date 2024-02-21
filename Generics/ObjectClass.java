package Generics;

// since isme humne return type object rkha h so we can store any type of datatype in it
public class ObjectClass {
    public static void main(String[] args) {
        Box box = new Box(25);
        box.container="My naam is Vaibhav";
        System.out.println(box.getValue());
    }
}


class Box{
    Object container;

    public Box(Object container){
        this.container=container;
    }
    public Object getValue(){
        return this.container;
    }
}
