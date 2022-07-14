class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        // numLen
        int [][] numMap = {
            {}, {0,0}, {0,1}, {0,2}, {1,0}, {1,1}, {1,2}, {2,0}, {2,1}, {2,2}, {3,0}, {3,1}, {3,2}
        };
        
        // hands location
        int leftHand = 10;
        int rightHand = 12;
        for (int num : numbers){
            if (num == 1 || num == 4 || num == 7) {
                answer += "L";
                leftHand = num;
            }
            
            if (num == 3 || num == 6 || num == 9) {
                answer += "R";
                rightHand = num;
            } 
            
            if (num == 2 || num == 5 || num == 8 || num == 0) {
                if (num == 0) {
                    num = 11;
                }
                int leftLen = Math.abs(numMap[num][0] - numMap[leftHand][0]) + Math.abs(numMap[num][1] - numMap[leftHand][1]);
                int rightLen = Math.abs(numMap[num][0] - numMap[rightHand][0]) + Math.abs(numMap[num][1] - numMap[rightHand][1]);
                
                if (leftLen < rightLen) {
                    answer += "L";
                    leftHand = num;
                }
                else if (leftLen > rightLen) {
                    answer += "R";
                    rightHand = num;
                }
                else {
                    if (hand.equals("right")) {
                        answer += "R";
                        rightHand = num;
                    }
                    if (hand.equals("left")) {
                        answer += "L";
                        leftHand = num;
                    }
                }
                
            }
            
        }
        return answer;
    }
}
