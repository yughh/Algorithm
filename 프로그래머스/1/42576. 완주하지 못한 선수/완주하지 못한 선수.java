import java.util.*;
import java.util.Map.Entry;

class Solution {
    public String solution(String[] participant, String[] completion) {
       	String answer = "";
        boolean check = false;
        
        Map<String, Integer> map = new HashMap();
        Map<String, Integer> map2 = new HashMap();
        
        for(int i=0; i<participant.length; i++){
            map.put(participant[i], map.getOrDefault(participant[i], 0)+1);
        }
        
        
        for(int i=0; i<completion.length; i++){
            map2.put(completion[i], map2.getOrDefault(completion[i], 0)+1);
        }
        
       
        for( Entry<String, Integer> a : map.entrySet()) {
            if(map2.containsKey(a.getKey()) == true){
               if( map2.get(a.getKey()).equals(a.getValue())){
            	   
               }else {
            	   answer = a.getKey();
            	   break;
               }
           }else {
        	   answer = a.getKey();
        	   break;
           }
        }
        return answer;
    }
}