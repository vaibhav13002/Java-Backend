package ExceptionHandling;

public class ExceptionPropogation {
    void m(){  
        // try{
        int data=50/0;  
        // }catch(Exception e){
        //     System.out.println("Exception pakda gya");
        // }
        System.out.println("Method m");  // run nhi hoga kyuki reach he nhi hua // agr yaha he exception catch ho jae tb print hoga
      }  
      void n(){  
        m();
        System.out.println("Method n");   // run nhi hoga kyuki reach he nhi hua
      }  
      void p(){  
        ///////////////////////n();
       try{  
        n();  
       }catch(Exception e){System.out.println("exception handled");}  
       System.out.println("Method p");
      }  
    public static void main(String[] args) {
        ExceptionPropogation obj=new ExceptionPropogation();  
        obj.p();  
        System.out.println("normal flow...");  
    }
}
// When this exception occurs, the control is transferred to the nearest catch block that can handle it.