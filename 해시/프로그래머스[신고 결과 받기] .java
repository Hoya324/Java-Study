import java.util.*;


class Solution {
  public int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = new int [id_list.length];
    
    HashMap<String, HashSet<String>> reportedMap = new HashMap<>(); // [신고된 유저id, 신고한 유저id]
    HashMap<String,Integer> answerMap = new HashMap<>(); // [신고한 유저ID, 신고된 횟수] 
    
    // 초기화
    for (int i=0;i<id_list.length;i++) {
      // 1. 신고된 유저에 신고한 유저 HashSet으로 중복없이 작성
      HashSet<String> reporting = new HashSet<>();
      reportedMap.put(id_list[i], reporting);
      answerMap.put(id_list[i], 0);
    }

    for (String s : report) {
      String [] str = s.split(" ");
      String reportingId = str[0];
      String reportedId = str[1];

      reportedMap.get(reportedId).add(reportingId);
    }

    for (String userId : reportedMap.keySet()) {
      if (reportedMap.get(userId).size() >= k) {
        for (String ans : reportedMap.get(userId)) {
          answerMap.put(ans, answerMap.get(ans) + 1);
        }
      }
    }

    for (int i = 0; i < id_list.length; i++) {
      answer[i] = answerMap.get(id_list[i]);
    }

    return answer;
  }
}
