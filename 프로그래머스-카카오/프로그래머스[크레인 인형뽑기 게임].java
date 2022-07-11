// import java.util.*;

// class Solution {

//     public static int search(int N, int move, int[][] board) {
//         int result = 0;
//         for (int i = 0; i < N; i++) {
//             if (board[i][move-1] != 0) {
//                 result = board[i][move-1];
//                 board[i][move-1] = 0;
//                 break;
//             }
//         }
//         return result;
//     } 
    
//     public int solution(int[][] board, int[] moves) {
        
//         int answer = 0;
//         int N = board[0].length;
//         ArrayList<Integer> basket = new ArrayList<>();
        
//         //System.out.println(N);
        
//         for (int move : moves) {
//             basket.add(search(N, move, board));

//             if (basket.size() > 1 && basket.get(basket.size()-1) == basket.get(basket.size()-2)) {
        
//                 basket.remove(basket.size()-1);
//                 basket.remove(basket.size()-1);
//                 answer += 2;
//             }
            
//         }
//         return answer;
//     }
// }