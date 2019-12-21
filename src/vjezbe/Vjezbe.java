package vjezbe;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
public class Vjezbe {

    public static void main(String[] args)
    {
    
      
       
       try(XMLDecoder s = new XMLDecoder (new FileInputStream("MyCaar"));){
           
           Car c = (Car)s.readObject();
           System.out.println(c);
           
       }catch(IOException exc){
           System.out.println(exc);
       }
        




      
        
   
    
        
        
    }
   
       
}
