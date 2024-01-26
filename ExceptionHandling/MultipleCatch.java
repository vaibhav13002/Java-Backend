package ExceptionHandling;


public class MultipleCatch {
    public static void main(String[] args) {
        try{    
            int a[]=new int[5];    
            a[5]=30/0;    
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)   // isko last me ki upr ke koi bhi listed ecxeption me se nhi hua tho a ...isko upr dale tho baki ka check he nhi hoga
              {  
               System.out.println("Parent Exception occurs");  
              }             
           System.out.println("rest of the code");    
    }
}

// catch(ArithmeticException | NullPointerException | ArraylndexOutOfBoundsException){
// System.out.printin(e);
// }