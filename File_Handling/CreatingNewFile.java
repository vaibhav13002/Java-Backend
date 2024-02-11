package File_Handling;

import java.io.*;

public class CreatingNewFile {
    public static void main(String[] args) {
        File obj = new File("Bega2.txt");
        try {
            if(obj.createNewFile()){
                System.out.println("File created successfully..");
            }else{
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            System.out.println("Exception aagya h..");
        }
    }
}
//