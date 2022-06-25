import java.io.*;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException{
       BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

       int testcase = Integer.parseInt(scan.readLine()); // 테스트 수 

        for (int i = 0; i < testcase; i++){
            StringTokenizer st = new StringTokenizer(scan.readLine(), " ");
            // 공백을 기준으로 입력받음.
            int N = Integer.parseInt(st.nextToken()); // 학생 수
            
            double array [] = new double[N]; // 성적을 입력 받을 배열

            double sum = 0; // 성적 누적 합 변수

            // 성적 입력부분
            for (int j = 0; j < N; j++){
                double data = Integer.parseInt(st.nextToken());
                array[j] = data;
                sum += data;
            }
            
            double average = (sum / (double) N); // 성적 평균
            //System.out.println(average);
            
            int count = 0;
            for (int j = 0; j < N; j++){
                if (array[j] > average){
                    count += 1;
                }
                //System.out.println(count);
            }

            double result = ((double)count / (double)N) * 100.0;
            System.out.printf("%.3f%%\n", result);
        }
    }   
}
