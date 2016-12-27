import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
public class program2 {

    public static void main(String[] args) {
        try
            {
                //FileInputStream in = new FileInputStream("inputFile.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String strLine;
       
                while((strLine = br.readLine())!= null)
                    {
                        System.out.println(new StringBuilder(strLine).reverse().toString());
                    }
       
            }catch(Exception e){
            System.out.println(e);
        }
       
    }

}
