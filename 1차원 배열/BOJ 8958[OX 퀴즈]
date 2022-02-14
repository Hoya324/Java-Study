import java.io.*;

public class Main{


    public static void main(String[] args) throws IOException { 
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(scan.readLine());
        String ox [] = new String[test];
        for (int i = 0; i < test; i++){
            ox[i] = scan.readLine();
        }
        
        for (int j = 0; j < test; j++){
            int count = 0;
            int sum = 0;
            for (int i = 0; i < ox[j].length(); i++){
                if (ox[j].charAt(i) == 'O'){
                    count += 1;
                    sum += count;
                }
                else{
                    count = 0;
                }
            }
            System.out.println(sum); 
        }
    }   
}
