package ExceptionHandling;

public class ThrowException {
    public static void validate(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  // koi bhi exception throw krwa sktey h
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
