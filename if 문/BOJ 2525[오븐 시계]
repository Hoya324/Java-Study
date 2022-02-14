import java.io.*;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) throws IOException { 
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        
        String time [] = scan.readLine().split(" ");
        int plusMinute = Integer.parseInt(scan.readLine());
        int total = Integer.parseInt(time[1]) + (Integer.parseInt(time[0]) * 60) + plusMinute;

        int newHour = total / 60;
        int newMinute = total % 60;

        if (total == 1440){
            System.out.println("0" + " 0");
        }
        else if (newHour > 23){
            System.out.println(newHour % 24 + " " +newMinute);
        }
        else{
            System.out.println(newHour + " " + newMinute);
        }
    }   
}
