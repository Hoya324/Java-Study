import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {

    public static void createStar(int n, int i) {
        for (int j = 0; j < n-i; j++) {
            System.out.print(" ");
        }

        for (int star = 0; star < 2*i-1; star++) {
            System.out.print("*");
        } 

        System.out.println();
    }   


    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n+1; i++) {
            createStar(n, i);
        }

        for (int i = n-1; i > 0;i--) {
            createStar(n, i);
        }
        
    }
}
