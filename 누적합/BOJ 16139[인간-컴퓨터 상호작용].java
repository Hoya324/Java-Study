import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        int q = Integer.parseInt(br.readLine());
        
        
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            String alphabet = st.nextToken();
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            

            int [] arr = new int[S.length()];

            if (alphabet.equals(S.substring(0,1))) {
                arr[0] = 1;
            }
            else {
                arr[0] = 0;
            }
        
            for (int j = 1; j < S.length(); j++) {
                if (alphabet.equals(S.substring(j,j+1))) {
                    arr[j] = arr[j-1] + 1;
                }
                else {
                    arr[j] = arr[j-1];
                }
            }

            if (l == 0) {
                sb.append(arr[r]).append("\n");
            }
            else {
                sb.append(arr[r] - arr[l-1]).append("\n");
            }

        }
        System.out.println(sb);

    }
}