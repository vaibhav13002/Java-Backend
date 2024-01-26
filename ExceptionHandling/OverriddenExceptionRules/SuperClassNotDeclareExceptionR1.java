package ExceptionHandling.OverriddenExceptionRules;
// package ExceptionHandling;
// // Rule 1: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.

// //super method pehle likh chuke h nd baad me override kr rheh so run krne ke baad pta chalega

// import java.io.IOException;

// class Parent {

//     // defining the method
//     public void msg() {
//         System.out.println("parent method");
//     }
// }

// public class SuperClassNotDeclareExceptionR1 extends Parent {

//     // overriding the method in child class
//     // gives compile time error
//  public void msg() throws ArithmeticException {  //IoException hoga tho error dega compile time pr he 
//         System.out.println("TestExceptionChild");
//     }

// public class SuperMethodNotDeclareExceptionR1 {
//     Parent p = new SuperClassNotDeclareExceptionR1();    
//     p.msg(); 
// }
// }

// complete other rules