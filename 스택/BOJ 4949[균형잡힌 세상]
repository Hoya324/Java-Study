import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    
    public static String yesOrNo(Stack<Character> stack) {
        if (stack.empty()) {
            return "yes";
        }
        else {
            return "no";
        }
    }
    
	public static void main(String[] args) throws IOException{

    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    
    while (true) {
        String str = scan.readLine();
        if (str.equals(".")) {
            break;
        }
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < str.length(); i++){
            char text = str.charAt(i);
            
            // 왼쪽 괄호를 스택에 쌓음
            if (text == '(') {
                stack.push('(');
            }
            else if (text == '[') {
                stack.push('[');
            }
            
            //소괄호
            // 오른쪽 괄호가 올 때 비어있거나 짝이 다른 괄호일 경우 '먼저' 제거
            if (text == ')' && (stack.empty() || stack.peek() == '[')) {
                stack.push('n');
                break;
            }
            // 해당하는 괄호가 올 경우
            else if (text == ')' && stack.peek() == '(') {  
                stack.pop();                   
            }

            // 대괄호
            if (text == ']' && (stack.empty() || stack.peek() == '(')) {
                stack.push('n');
                break;
            }
            else if (text == ']' && stack.peek() == '[') {
                stack.pop();       
            }

            // 마침표가 올 경우 문장 종료
            if (text == '.') {
                break;
            }
            
        }
        System.out.println(yesOrNo(stack));
    }

        
    }
}   
