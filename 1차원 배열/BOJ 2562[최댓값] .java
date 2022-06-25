import java.io.*;

public class Main{
 
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        
        int array [] = new int[9];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scan.readLine());

            if(array[i] > array[index])
            {
                index = i;
            }

        }
        
        System.out.println(array[index]);
        System.out.println(index + 1);
    } 
    
}
