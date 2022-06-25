import java.util.*;


class Solution {
  public int[] solution(int[] lottos, int[] win_nums) {
    int[] answer = new int [2];

    
    // lottos의 수와 win_nums을 ArrayList로 초기화한다.
    List<Integer> lottosList = new ArrayList<>();

    List<Integer> win_numsList = new ArrayList<>();

    // 각각의 값을 입력한다.
    for (int i = 0; i < 6; i++) {
      lottosList.add(lottos[i]);
      win_numsList.add(win_nums[i]);
    }

    // 교집합의 list를 구하고, 그 리스트의 길이를 구한다. 
    win_numsList.retainAll(lottosList);
    int min = win_numsList.size();

    // 교집합의 리스트 길이가 최소값이고, 그 수에 lottos의 0의 개수를 더한 것이 최대 값이다.
    int max = min + Collections.frequency(lottosList, 0);

    if (min < 2) {
      if (max > 1) {
        answer[0] = 7 - max;
      }
      else{
        answer[0] = 6;
      }
      answer[1] = 6;
    }
    else{
      answer[1] = 7-min;
      answer[0] = 7-max;
    }
    
    return answer;
  }
}
.java