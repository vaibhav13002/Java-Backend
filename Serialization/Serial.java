package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {
// isme ek doc naam ka file create hoga jisme a object write hoga and o machine lang me hoga jo ki now can be used to transfer from 1 jvm to another and after deserialization to another jvm output will be same

        try {
            Student st = new Student("Vaibhav", 22, "vaibhav@gmail.com", "Mumbai");

            //Writing data to file
            FileOutputStream fos = new FileOutputStream("doc.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
    
            oos.writeObject(st);
            oos.close();
            fos.close();
            System.out.println("Object State is successfully transferred to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
