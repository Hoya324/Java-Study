import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static int decoder(char c) {
        int second = 0;
        if ('A' <= c && c <= 'C') {
            second = 3;
        }
        else if ('D' <= c && c <= 'F') {
            second = 4;
        }
        else if ('G' <= c && c <= 'I') {
            second = 5;
        }
        else if ('J' <= c && c <= 'L') {
            second = 6;
        }
        else if ('M' <= c && c <= 'O') {
            second = 7;
        }
        else if ('P' <= c && c <= 'S') {
            second = 8;
        }
        else if ('T' <= c && c <= 'V') {
            second = 9;
        }
        else if ('W' <= c && c <= 'Z') {
            second = 10;
        }
        else {
            second = 11;
        }
        return second;
    }
    
	public static void main(String[] args) throws IOException{

    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    String alphabet = scan.readLine();

    int sum = 0;
    for (int i = 0; i < alphabet.length(); i++) {
        sum += decoder(alphabet.charAt(i));
    }
    System.out.print(sum);

        
    }
}
