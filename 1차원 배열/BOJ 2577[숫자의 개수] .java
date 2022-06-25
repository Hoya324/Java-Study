import java.io.*;

public class Main{
 
    public static void main(String[] args) throws IOException { 
    int array [] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int value = 1;
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 3; i++)
    {
        value *= Integer.parseInt(scan.readLine());
    }
    for (int i = 0; i < String.valueOf(value).length(); i++)
    {
       int temp = Integer.parseInt(String.valueOf(String.valueOf(value).charAt(i)));
       switch (temp) {
           case 0: array[0]++; break;
           case 1: array[1]++; break;
           case 2: array[2]++; break;
           case 3: array[3]++; break;
           case 4: array[4]++; break;
           case 5: array[5]++; break;
           case 6: array[6]++; break;
           case 7: array[7]++; break;
           case 8: array[8]++; break;
           case 9: array[9]++; break;
           default:
           
       }
    }
    for (int i = 0; i < 10; i++)
    {
        System.out.println(array[i]);
    }

    } 
    
}
