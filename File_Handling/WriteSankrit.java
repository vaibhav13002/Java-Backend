package File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteSankrit {
    public static void main(String[] args) {
         // create
    try {
      File fo = new File("Bega.txt");
      fo.createNewFile();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    // write in the file
    try {
      FileWriter fw = new FileWriter("Bega.txt");
      fw.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज, अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुच:");
      fw.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    // reading from a file
    // try (BufferedReader br = new BufferedReader(new FileReader("Bega.txt"))) {
    //   while (br.ready()) {
    //     System.out.println(br.readLine());
    //   }
    // } catch (IOException e) {
    //     System.out.println(e.getMessage());      
    // }

    // create
    // try {
    //   File fo = new File("random.txt");
    //   fo.createNewFile();
    //   if(fo.delete()) {
    //     System.out.println(fo.getName());
    //   }
    // } catch (IOException e) {
    //   System.out.println(e.getMessage());
    // }
    }
}
