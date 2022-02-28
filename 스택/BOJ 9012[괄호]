import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{

    public static String yesOrNo(String braket) {
        int res = 0;
        for (int i = 0; i < braket.length(); i++) {
            if (braket.charAt(i) == '(') {
                res += 1;
            }
            else if (braket.charAt(i) == ')' && res > 0) {
                res -= 1;
            }
            else {
                return "NO";
            }
        }
        if (res == 0) {
            return "YES";
        }
        return "NO";
    }
	public static void main(String[] args) throws IOException{

    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(scan.readLine());

    
    for (int i = 0; i < N; i++) {
        String data = scan.readLine();
        System.out.println(yesOrNo(data));
    }
        
    }
}   
