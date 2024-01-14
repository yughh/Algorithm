import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        List<String> arr = new ArrayList();
        
        for(int i=0; i<s.length(); i++){
            arr.add(s.charAt(i)+"");
        }
        
        Collections.sort(arr, Collections.reverseOrder());
         
        for(int i=0; i<arr.size(); i++){
            answer += arr.get(i);
        }
        
        return answer;
    }
}