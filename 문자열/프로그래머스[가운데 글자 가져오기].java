class Solution {
    public String solution(String s) {
        int half;
        String answer = "";
        if (s.length() % 2 == 0) {
            half = s.length() / 2 - 1;
            answer += Character.toString(s.charAt(half));
            answer += Character.toString(s.charAt(half+1));
        }
        else {
            half = s.length() / 2;
            answer += Character.toString(s.charAt(half));
        }
        
        return answer;
    }
}