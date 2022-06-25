import java.io.*;
import java.util.Arrays;

public class Main{

    public static int counter(int a, int b) {
        return (a == b) ? 1: 0;
    }

    public static int max(int a, int b) {
        return (a > b) ? a: b;
    }

    public static void main(String[] args) throws IOException { 
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        
        String dice [] = scan.readLine().split(" ");
        Arrays.sort(dice);
        int compareDice = 0;
        int count = 1;
        int Max = 0;
        int result = 0;

        for (int i = 0; i < 3; i++) {
            if (counter(compareDice, Integer.parseInt(dice[i])) == 1) {
                result = Integer.parseInt(dice[i]);
                count += 1;
            }
            else {
                compareDice = Integer.parseInt(dice[i]);
            }
            Max = max(Max, Integer.parseInt(dice[i]));
        }
        
        if (count == 1) {
            System.out.println(Max * 100);
        }
        else if (count == 2) {
            System.out.println(1000 + (result * 100));
        }
        else if (count == 3) {
            System.out.println(10000 + (result * 1000));
        }
        
    }   
}
