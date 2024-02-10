package File_Handling;

import java.io.FileWriter;   
// Importing the IOException class for handling errors  
import java.io.IOException;   
   
class WriteToFile {  
    public static void main(String[] args) {  
      
    try {  
        FileWriter fwrite = new FileWriter("C:\\Users\\Vaibhav Mishra\\Desktop\\Java Backend\\File_Handling\\Bega.txt");  
        // writing the content into the FileOperationExample.txt file  
        fwrite.write("My name is Vaibhav Mishra, i am the owner of this file."+ System.lineSeparator());   
        fwrite.write("45");
        // Closing the stream  
        fwrite.close();   
        System.out.println("Content is successfully wrote to the file.");  
    } catch (IOException e) {  
        System.out.println("Unexpected error occurred");  
        e.printStackTrace();  
        }  
    }  
}
