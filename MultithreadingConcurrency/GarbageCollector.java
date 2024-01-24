    package MultithreadingConcurrency;

public class GarbageCollector {
    public void finalize(){ //jab gc kaam krega tab finalize ko call krega
        System.out.println("object is garbage collected");
    }  
    public static void main(String[] args) {
        GarbageCollector s1=new GarbageCollector();  
        GarbageCollector s2=new GarbageCollector();  
        s1=null;  
        s2=null;  
        System.gc();  
    }
}
