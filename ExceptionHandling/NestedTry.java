package ExceptionHandling;

public class NestedTry {
    public static void main(String[] args) {
        // outer try block
        try {
            int v= 4/0;
            System.out.println(v);  // handle by only outer catch
            // inner try block 1
            try {
                System.out.println("going to divide by 0");
                int b = 39 / 0;
            }
            // catch block of inner try block 1
            catch (ArithmeticException e) {  // agr a block iska excepton handle nhi kr paya tho nichey ka kuch bhi execute nhi hoga..a sidha outer loop ke catch ke paas jayega
                System.out.println(e);
            }
            // inner try block 2
            try {
                int a[] = new int[5];
                // assigning the value out of array bounds
                a[5] = 4;
            }
            // catch block of inner try block 2
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("other statement");  // a tabhi run hoga jab inner block me se koi catch krega... agr  catch outer me hota h tho a nhi run krega
        }
        // catch block of outer try block // andr waley me koi nhi catch krega ya match nhi hua tho bhr wala krega 

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("handled the exception (outer catch)");
        }
        System.out.println("normal flow..");
    }
}
// When any try block does not have a catch block for a particular exception, then the catch block of the outer (parent) try block are checked for that exception, and if it matches, the catch block of outer try block is executed.

// If none of the catch block specified in the code is unable to handle the exception, then the Java runtime system will handle the exception. Then it displays the system generated message for that exception.

