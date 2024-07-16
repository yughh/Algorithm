import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];       
        for(int i=0; i<answer.length; i++ ){ //열
             int temp = k;
            for(int j=0; j<picture[i/k].length()*k; j++){
                if(j == 0)  answer[i] = (picture[i/k].charAt(j/k))+"" ; 
                else answer[i] += (picture[i/k].charAt(j/k))+"" ; 
            }
            if(i%k != 0){
                answer[i] = answer[i -(i%k)];
            }
        }
        
        return answer;
    }
}