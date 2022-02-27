import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main{

	public static void main(String[] args) throws IOException{

    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(scan.readLine());
    int size = 0;
    String [] stack = new String[N];
        
    for (int i = 0; i < N; i++) {
        String command = scan.readLine();
        
        if (command.contains("push")) {
            String [] data = command.split(" ");
            stack[size] = data[1];
            size++;
        }

        else if (command.contains("pop")) {
            if (size == 0) {
                bw.write(-1+"\n");
            }
            else {
                bw.write(stack[size-1]+"\n");
                size--;
            }
        }
        
        else if (command.contains("size")) {
            bw.write(size+"\n");
        }

        else if (command.contains("empty")) {
            if (size == 0) {
                bw.write(1+"\n");
            }
            else {
                bw.write(0+"\n");
            }
        }

        else if (command.contains("top")) {
            if (size == 0) {
                bw.write(-1+"\n");
            }
            else {
                bw.write(stack[size-1]+"\n");
            }
        }
        
        }
    bw.flush();
   	bw.close();    
    }
}   
