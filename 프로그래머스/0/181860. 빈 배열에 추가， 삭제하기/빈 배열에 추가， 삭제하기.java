import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList();
        
        for(int i=0; i<arr.length; i++){
            if(flag[i]){
                int temp = arr[i]*2;
                while (temp > 0){
                    temp--;
                    list.add(arr[i]);
                }
            }else{
                 int temp = arr[i];
                while (temp > 0){
                    temp--;
                    list.remove(list.size()-1);
                }
            }
                
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}