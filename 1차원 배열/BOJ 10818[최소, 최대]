import java.io.*;
import java.util.*;

public class Main{

    public static int max(int a, int b) {
        return (a > b) ? a: b;
    } 
    
    public static int min(int a, int b) {
        return (a < b) ? a: b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //입력 받은 문자열을 공백을 기준으로 나눈다.

        int Min = 1000001;
        int Max = -1000001;
        
        while(st.hasMoreTokens()) {
            int i = Integer.parseInt(st.nextToken());
            Max = max(Max, i);
            Min = min(Min, i);

        }
        System.out.println(Min + " " + Max);


    }
    
}
