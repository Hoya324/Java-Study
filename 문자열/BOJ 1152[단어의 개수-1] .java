// ver.1

import java.io.*;

public class Main{
        
    
	public static void main(String[] args) throws IOException{
        
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        String trimmed = scan.readLine().trim();
	    String [] text;
        if (trimmed.length() != 0) {
            text = trimmed.split(" ");
        } 
        else {
            text = new String[0];
        }
        
        if (text.length == 1 && text[0].equals("")) {            
            System.out.print(text.length - 1);
        }
        else{
            System.out.print(text.length);
        }
    }
}
