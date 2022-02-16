import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {
 
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        
        int [] result = new int[26];
        for (int i = 0; i < 26; i++) {
            result[i] = -1;
        }
        String string = scan.readLine();

        for (int i = 0; i < string.length(); i++) {

            int index = Character.getNumericValue(string.charAt(i))-10;
            
            if (result[index] == -1) {
                result[index] = i;
            }
            
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(result[i] + " ");
        }
        
        
    }   
}

// import java.io.*;

// public class Main
// {		
// 		public static void main(String[] args) throws IOException
// 		{
// 				BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
// 				String string = scan.readLine().trim();
// 				for(char c = 'a'; c<='z'; c++)
// 					System.out.print(string.indexOf(c)+" ");				
// 		}
// }
