import java.io.*;
import java.util.*;

public class Caesar{

    public static void main(String[] args)throws IOException{
        
        int key = Integer.parseInt(args[0]);
        InputStream input = System.in;
        OutputStream output = System.out;
        int txt;
        while((txt= input.read())!=-1){
            
       
         txt =  txt % 256;
         output.write(txt); 
        
        
        }
        output.flush();
        
       
       
       
        
       
    }

}


