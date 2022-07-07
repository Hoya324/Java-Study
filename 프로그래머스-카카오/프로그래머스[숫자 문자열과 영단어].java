import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // making map of numbers
        HashMap<Integer,String> numMap = new HashMap<Integer, String>(){{
            put(0,"zero");
            put(1,"one");
            put(2,"two");
            put(3,"three");
            put(4,"four");
            put(5,"five");
            put(6,"six");
            put(7,"seven");
            put(8,"eight");
            put(9,"nine");
        }};
        System.out.println(numMap);
        
        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(numMap.get(i), Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}