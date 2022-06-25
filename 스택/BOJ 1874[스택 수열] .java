import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    
	public static void main(String[] args) throws IOException{

    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(scan.readLine());
    Stack<Integer> stack = new Stack<Integer>();
    StringBuilder sb = new StringBuilder();
    int i = 1;
        
    for (int count = 0; count < N; count++) {
        int goal = Integer.parseInt(scan.readLine());
        
        if (stack.size() > 0 && stack.peek() > goal) {
                System.out.print("NO");
                sb.setLength(0);
                break;
        }

        if (i <= goal) {
            while (i <= goal) {
                sb.append("+\n");
                stack.push(i);  
                i++;
            }
            stack.pop();
            sb.append("-\n");
        }

        else if (i > goal) { // 목표값이 이미 스택에 있는 경우
            while ((stack.peek()).equals(goal)) {
                stack.pop();
                sb.append("-\n");
                if (stack.size() == 0) {
                    break;
                }
            }
        }
        
    } 
    System.out.print(sb);
    }
}   
