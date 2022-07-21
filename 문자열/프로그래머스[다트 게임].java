class Solution {
    public int solution(String dartResult) {
        int[] game = new int[3];
        char[] charList = dartResult.toCharArray();
        int idx = -1;
        for (int i=0;i<charList.length;i++) {
            if (charList[i] >= '0' && charList[i] <= '9') {
                idx++; 
                game[idx] += Integer.parseInt(String.valueOf(charList[i]));
            
                if (i+1!=charList.length-1 && charList[i+1] == '0'&& charList[i] == '1') {
                    game[idx] -= Integer.parseInt(String.valueOf(charList[i]));
                    game[idx] = 10;
                    i++;                    
                }                
            } else if (charList[i] == 'D') { 
                game[idx] *= game[idx]; 
            } else if(charList[i] == 'T') { 
                game[idx] *= game[idx] * game[idx];
            } else if (charList[i] == '*') { 
                if (idx > 0) game[idx-1] *=2;                
                game[idx] *= 2;
            } else if (charList[i] == '#') {              
                game[idx] *= -1;
            }
        }
        return game[0] + game[1] + game[2];
    }
}