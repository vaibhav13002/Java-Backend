package ExceptionHandling;
import java.io.IOException;

class M {
    void methodName() throws IOException {
        throw new IOException("device error");
    }
}
public class ThrowsKeyword {
    public static void main(String[] args) {
        try {
            M m = new M();
            m.methodName();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
        System.out.println("normal flow...");
    }
}
