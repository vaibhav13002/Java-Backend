package File_Handling;

import java.io.FileWriter;   
// Importing the IOException class for handling errors  
import java.io.IOException;   
   
class WriteToFile {  
    public static void main(String[] args) {  
      
    try {  
        FileWriter fwrite = new FileWriter("Bega.txt",true);   // true likhne se ab koi bhi changes append hoga vaise overwrite horha tha
        // writing the content into the FileOperationExample.txt file  
        fwrite.write(" सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुच:");
        // fwrite.write("45");
        // Closing the stream  
// ab a sanskrit language file me ?????? aise likha rhega coz  it doesnt support unicode character// isme bina true ke saath support krega shyd // not working

        fwrite.close();   
        System.out.println("Content is successfully wrote to the file.");  
    } catch (IOException e) {  
        System.out.println("Unexpected error occurred");  
        e.printStackTrace();  
        } 
    }  
}
