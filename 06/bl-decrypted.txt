import java.io.*;
import java.util.*;

public class BitLevel{

    public static void main(String[] args)throws IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter key:");
        FileInputStream input = new FileInputStream(args[0]);
        FileOutputStream output = new FileOutputStream(args[1]);
        String key = scan.nextLine();
        char[] keyChars = key.toCharArray();
        int i = 0;
        int k = 0;
        while(((k = input.read()) != -1)){
            if (i == keyChars.length){
                i = 0;
            }
            output.write(k^keyChars[i]);
            output.flush();
            i++;
        }
    }

}
