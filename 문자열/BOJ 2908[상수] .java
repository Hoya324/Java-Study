import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{

    public static int changer(int a, int b) {
        int first = (a % 10) * 100;
        int second = ((a / 10) % 10) * 10; 
        int last = (a / 100);
        int newA = first + second + last;
        
        int first1 = (b % 10) * 100;
        int second1 = ((b / 10) % 10) * 10; 
        int last1 = (b / 100);
        int newB = first1 + second1 + last1;
        return newA > newB ? newA: newB;
    }
    
	public static void main(String[] args) throws IOException{
        
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));    
        StringTokenizer st = new StringTokenizer(scan.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        System.out.print(changer(A, B));

    }
}
