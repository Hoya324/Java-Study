import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{

	public static void main(String[] args) throws IOException{

    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(scan.readLine());
        
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
        
    
    int [] values = new int [N];
    for (int i = 0; i < N; i++) {
        values[i] = Integer.parseInt(scan.readLine());
    }
    int count = 0;
    for (int i = N-1; i >= 0; i--) {
        if (K / values[i] != 0) {
            count += K / values[i];
        }
        K %= values[i];
    }

    System.out.print(count);
        
    }
}
