
import java.util.*;
import java.util.Scanner;


public class Caesar
{
    public static int key;
    public static void main(String[] args)
    {
         key = Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            
            /*new line character?*/
            System.out.print(encode(sc.nextLine(), key));
        }
    }
    //ASCII not alphbetical
    //need to handle white space
    //need to handle new line character
    public static String encode(String enc, int key) {
        String s = "";
        for(int i = 0; i < enc.length(); i++){
            char c = (char) (enc.charAt(i) + key);
            if((int)c > 255){
                //take the remainder after 255 
               
            }
            int x = (int)c % 255;
            s += c;

        }
        //convert char array back to a string and return.
        return  s + "\n";
    }
}


