import java.util.*;

class Solution {
    public int[] solution(long n) {
        String abc = n+"";
        int[] answer = new int[abc.length()];
        int cnt = 0;
        
        
        for(int i=abc.length()-1; i>=0; i--){
            String temp = abc.charAt(i)+"";
             answer[cnt] = Integer.parseInt(temp);
             cnt++;
        }
        
        return answer;
    }
}