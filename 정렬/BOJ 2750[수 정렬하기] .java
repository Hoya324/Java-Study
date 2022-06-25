import java.io.*;
import java.util.*;



public class Main{

    
	public static void main(String[] args) throws IOException{

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(scan.readLine());
        int [] arr = new int [N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(scan.readLine());
        }
        StringBuilder sb = new StringBuilder();
        // 가장 작은 수를 앞으로
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            sb.append(arr[i] + "\n");
        }

        System.out.print(sb);

    }
}   

// Arrays methods
/* import java.io.*;
import java.util.*;



public class Main{

    
	public static void main(String[] args) throws IOException{

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(scan.readLine());
        int [] arr = new int [N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(scan.readLine());
        }
        StringBuilder sb = new StringBuilder();
       
        Arrays.sort(arr);
        
        for (int i = 0; i < N; i++) {
            sb.append(arr[i] + "\n"); 
        }

        System.out.print(sb);

    }
}   */
