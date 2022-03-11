// Collections.sort

import java.io.*;
import java.util.*;



public class Main{

    
	public static void main(String[] args) throws IOException{

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(scan.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(scan.readLine()));
        }
        StringBuilder sb = new StringBuilder();
       
        Collections.sort(arr);
        
        for (int i : arr) {
            sb.append(i + "\n"); 
        }

        System.out.print(sb.toString());

    }
}

//Counting sort

import java.io.*;


public class Main{

    
	public static void main(String[] args) throws IOException{

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(scan.readLine());
        boolean [] arr = new boolean[2000001];
        
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(scan.readLine()) + 1000000] = true;
        }
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]) {
                sb.append(i - 1000000 + "\n");
            }
        }

        System.out.print(sb.toString());

    }
}
