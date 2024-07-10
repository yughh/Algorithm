import java.util.*;

class Solution {
    public int[] solution(int n) {
        //int[] answer = {};
        List<Integer> list = new ArrayList();
        while(n != 1){
            list.add(n);
            if(n%2 == 0){
                n = n/2;
            }else{
                n = (3*n)+1;
            }
        }
        list.add(1);

        int[] answer = list.stream()
                          .mapToInt(Integer::intValue)
                          .toArray();
        return answer;
    }
}