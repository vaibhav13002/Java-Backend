package File_Handling;


public class CharPrint {
    public static void main(String[] args) {
        // try(FileReader fr = new FileReader("C:\\Users\\Vaibhav Mishra\\Desktop\\Java Backend\\File_Handling\\Bega.txt")) { 
        //     int letters = fr.read();
        //     while(fr.ready()){
        //         System.out.println((char)letters);
        //         letters=fr.read();
        //     }
        //     System.out.println();
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }
///////////////////////////////////////////////////////////////////////////
// Integer.parseInt() method to convert a string to an integer
        String s = "Vaibhav is";
        try{ int Value = Integer.parseInt(s);
            System.out.println((char)Value);}
            catch(NumberFormatException e){
                System.out.println("Error aya h bhai");
            }
    }
}