import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList();
        int temp =0;
        for(int i : arr){
            temp = i;
            while(temp != 0){
                temp--;
                list.add(i);
            }
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}