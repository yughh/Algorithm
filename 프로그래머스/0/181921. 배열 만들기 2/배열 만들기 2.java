import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        //int[] answer = {};
        List<Integer> list = new ArrayList();
        for(int i=l; i<= r; i++){
            String s = i+"";
            s = s.replace('5', '0');
            s = s.replace('0', '0');
            if(Integer.parseInt(s) == 0) list.add(i);
        }
        if(list.size() == 0) list.add(-1);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}