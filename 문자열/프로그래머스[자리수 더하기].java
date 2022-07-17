import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String strNum = Integer.toString(n);
        
        for (int i = 0; i < strNum.length(); i++) {
            answer += Integer.parseInt(Character.toString(strNum.charAt(i)));
        }

        return answer;
    }
}