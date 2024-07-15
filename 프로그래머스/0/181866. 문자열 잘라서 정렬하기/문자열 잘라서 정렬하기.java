import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] temp = myString.split("x");
        String ss = "";
        for(String s : temp){
            if(s.equals("") || s.equals(" ")){
                
            }else{
                ss += s+" ";
            }
        }
         String[] answer = ss.split(" ");
        Arrays.sort(answer);
       
        return answer;
    }
}