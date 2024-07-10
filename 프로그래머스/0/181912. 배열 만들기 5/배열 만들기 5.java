import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList();
        int i=0;
        for(String ss : intStrs){
            i = Integer.parseInt(ss.substring(s, l+s)) ;
            if(i > k){
                list.add(i);
            }
        }
        
        int[] answer = list.stream()
                          .mapToInt(j -> j)
                          .toArray();
        return answer;
    }
}