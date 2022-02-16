import java.io.*;

public class Main{
        
    
	public static void main(String[] args) throws IOException{
        
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        
		int arr [] = new int[26];

        String text = scan.readLine().toUpperCase();
        
        for (int i = 0; i < text.length(); i++) {
            arr[text.charAt(i) - 'A']++;
        }

        int Max = -1;
        char result = '?';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
                result = (char) (i + 'A');
            }
            else if(arr[i] == Max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
