import java.io.*;
import java.util.*;

public class Main{

    
    
	public static void main(String[] args) throws IOException{

    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    Queue<Integer> queue = new LinkedList<>();    

    int N = Integer.parseInt(scan.readLine());
    for (int i = 1; i < N + 1; i++) {
        queue.add(i);
    }

    while (queue.size() != 1) {
        queue.remove();        
        queue.add(queue.peek());
        queue.remove();
    }

    System.out.print(queue.peek());
    }
}   
