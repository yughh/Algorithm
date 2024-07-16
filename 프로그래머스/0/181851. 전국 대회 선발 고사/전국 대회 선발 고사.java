import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int a =0;
        int b = 0;
        int c= 0;
        Map<Integer, Integer> map = new HashMap();
        
        for(int i=0; i<rank.length; i++){
            if(attendance[i]) map.put(rank[i], i);
        }
        
       for(int i=1; i<=100; i++){
           if(map.containsKey(i) && a == 0){
               answer += 10000*map.get(i); 
               a =1;
           }
           else if(map.containsKey(i) && b == 0) {
               answer += 100*map.get(i);
               b =1;
           }
           else if(map.containsKey(i) && c == 0){
               answer += map.get(i);
               c =1;
           }
       }
        
        return answer;
    }
}