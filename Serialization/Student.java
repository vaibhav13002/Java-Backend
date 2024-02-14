package Serialization;

import java.io.Serializable;

public class Student implements Serializable {

    private String Name;
    private int age;
    transient private String email;
    private String address;

    public Student(String name, int age, String email, String address) {
        Name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //// Function
    public void displayName(){
        System.out.println("Hey My Name is "+ this.Name);
    }
    
}
