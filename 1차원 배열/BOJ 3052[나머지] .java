import java.io.*;
import java.util.Arrays;

public class Main{
 
    public static void main(String[] args) throws IOException { 
        int array [] = {0, 0 ,0 ,0 ,0, 0, 0, 0, 0, 0};

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {   
            array[i] = Integer.parseInt(scan.readLine()) % 42;
        }
        Arrays.sort(array);
        int result = array[0];
        int count = 1;
        for (int i = 1; i < 10; i++)
        {
            if (array[i] != result)
            {
                count += 1;
                result = array[i];
            }
        }
        System.out.print(count);
    } 
    
}
