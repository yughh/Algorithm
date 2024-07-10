class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int num = 0;
        for(int i=1; i<numLog.length; i++){
           num = numLog[i] - numLog[i-1];
            if(num == 1) answer += "w";
            else if (num == -1) answer += "s";    
            else if (num == 10) answer += "d";
            else if (num == -10) answer += "a";
        }
        
        return answer;
    }
}