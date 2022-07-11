import java.util.*;

class Solution {

    public static int search(int N, int move, int[][] board) {
        int result = 0;
        for (int i = 0; i < N; i++) {
            if (board[i][move-1] != 0) {
                result = board[i][move-1];
                board[i][move-1] = 0;
                break;
            }
        }
        return result;
    } 
    
    public int solution(int[][] board, int[] moves) {
        
        int answer = 0;
        int N = board[0].length;
        Stack<Integer> basket = new Stack<>();
        
        //System.out.println(N);
        
        for (int move : moves) {
            int temp = search(N, move, board);
            if (temp != 0) {
                basket.push(temp);
            }
            

            if (basket.size() > 1 && basket.peek() == basket.get(basket.size()-2)) {
        
                basket.pop();
                basket.pop();
                answer += 2;
            }
            
        }
        return answer;
    }
}