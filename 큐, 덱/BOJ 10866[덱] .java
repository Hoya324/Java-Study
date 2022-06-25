import java.io.*;
import java.util.*;

public class Main{

    
	public static void main(String[] args) throws IOException{

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(scan.readLine());
        for (int i = 0; i < N; i++) {
            
            String [] command = scan.readLine().split(" ");
            
            if (command[0].contains("push_front")) {
                deque.addFirst(Integer.parseInt(command[1]));
                continue;
            }
                
            else if (command[0].contains("push_back")) {
                deque.addLast(Integer.parseInt(command[1]));
                continue;
            }
                
            else if (command[0].contains("pop_front")) {
                if (deque.size() == 0) {
                    sb.append(-1 + "\n");
                }
                else {
                    sb.append(deque.pollFirst() + "\n");
                }
                continue;
            }
                
            else if (command[0].contains("pop_back")) {
                if (deque.size() == 0) {
                    sb.append(-1 + "\n");
                }
                else {
                    sb.append(deque.pollLast() + "\n");
                }
                continue;
            }
                
            else if (command[0].contains("size")) {
                sb.append(deque.size() + "\n");
                continue;
            }
                
            else if (command[0].contains("empty")) {
                if (deque.isEmpty()) {
                    sb.append(1 + "\n");
                }
                else {
                    sb.append(0 + "\n");
                }
                continue;
            }
                
            else if (command[0].contains("front")) {
                if (deque.size() == 0) {
                    sb.append(-1 + "\n");
                }
                else {
                    sb.append(deque.peek() + "\n");
                }
                continue;
            }
                
            else if (command[0].contains("back")) {
                if (deque.size() == 0) {
                    sb.append(-1 + "\n");
                }
                else {
                    sb.append(deque.peekLast() + "\n");
                }
                continue;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}   
