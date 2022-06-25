import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException{

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            String data = scan.readLine();
            
            int len = data.length();

            if (len == 1 && data.equals("0")) {
                System.out.print(sb);
                break;
            }

            if (len == 1) {
                sb.append("yes").append("\n");
                continue;
            }
            
            else {
                for (int i = 0; i < len/2; i++) {
                    if (data.charAt(i) != data.charAt(len -1 - i)) {
                        sb.append("no").append("\n");
                        break;
                    }
                    else if (data.charAt(i) == data.charAt(len -1 - i)){
                        if (data.charAt(0) == '0') {
                            sb.append("no").append("\n");
                            break;
                        }
                        if (i == len/2 - 1) {
                            sb.append("yes").append("\n");      
                        }
                    }
                }        
            }
        }
    }
}   
