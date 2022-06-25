// ver.2

import java.io.*;
import java.util.*;

public class Main{
        
    
	public static void main(String[] args) throws IOException{
        
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String text = scan.readLine().trim();
        StringTokenizer st = new StringTokenizer(text);

        int count = 0;
        System.out.print(st.countTokens());

    }
}
