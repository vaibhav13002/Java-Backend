package File_Handling;

import java.io.File;   
// Importing FileNotFoundException class for handling errors  
import java.io.FileNotFoundException;   
// Importing the Scanner class for reading text files  
import java.util.Scanner;   
   
class ReadFromFile {  
    public static void main(String[] args) {  
        try {  
            // Create f1 object of the file to read data  
            File f1 = new File("C:\\Users\\Vaibhav Mishra\\Desktop\\Java Backend\\File_Handling\\Bega1.txt");    
            Scanner dataReader = new Scanner(f1);   // System.in means we r taking input from sytem(keyboard)
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            dataReader.close();  
        } catch (FileNotFoundException exception) {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace(); 
            // System.out.println(exception); 
        }  
    }  
}  
