package ExceptionHandling;
public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        // System.out.println(3/0);
        System.out.println(4);
        try{    
            //below code do not throw any exception  
               int data=25/0;    
               System.out.println(data);    
              }    
            //catch won't be executed  
              catch(NullPointerException e){  
                // catch(Exception e){    // to handle all kinds of exception
            System.out.println(e);  
            }
            
        finally{
            System.out.println("running regardless exception");
        }
        System.out.println("jai shree ram");
    }
}
// In your provided code, you are attempting to divide by zero (int data = 25/0;) inside the try block. This will result in an ArithmeticException, not a NullPointerException. Since you have specified catch(NullPointerException e), and the actual exception is an ArithmeticException, the catch block will not be executed.

// If you change the catch block to catch (Exception e), it will catch any exception that is a subclass of Exception, including ArithmeticException. Therefore, the catch block will be executed, and "jai shree ram" will not be printed.