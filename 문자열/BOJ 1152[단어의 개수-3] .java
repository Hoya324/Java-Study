// ver.3

import java.io.*;
import java.util.*;

public class Main{
        
    
	public static void main(String[] args) throws IOException{
        
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));    
        String text = scan.readLine();
        int count = 1;
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                continue;
            }
            else {
                count += 1;
            }            
        }
        if (text.equals("")) {
                count = 0;
        }
        System.out.print(count);
    }
}
.java