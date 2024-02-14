package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerial {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("doc.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student student = (Student)ois.readObject();
            student.displayName();
            System.out.println(student.getName());
            System.out.println(student.getEmail());
            System.out.println(student.getAddress());
            System.out.println(student.getAge());
            
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
