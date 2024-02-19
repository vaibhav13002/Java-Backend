package JavaURL;

import java.net.URL;

public class uRL2 {
    public static void main(String[] args) {
        try{    // pre define format extractor na ki getting in realtime
            URL url=new URL("https://www.ejdncjek.com/search?q=javatpojejejejejejejejejceid=chrome&ie=UTF-8");    
                
            System.out.println("Protocol: "+url.getProtocol());    
            System.out.println("Host Name: "+url.getHost());    
            System.out.println("Port Number: "+url.getPort());    
            System.out.println("Default Port Number: "+url.getDefaultPort());    
            System.out.println("Query String: "+url.getQuery());    
            System.out.println("Path: "+url.getPath());    
            System.out.println("File: "+url.getFile());    
              
            }catch(Exception e){System.out.println(e);}   

    }
}

