class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int sumNum = nums[i] + nums[j] + nums[k];
                    int count = 0;
                        
                    for (int l = 2; l < (int)Math.sqrt(sumNum)+1; l++) {
                        if(sumNum % l == 0) {
                            count += 1;
                            break;
                        }
                    }
                    if (count == 0) {
                        answer += 1;
                    }
                }
            }            
        }
            
        

        return answer;
    }
}