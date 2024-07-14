import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
       // int[] answer = {};
        List<Integer> list = new ArrayList();
        int a = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==2 || a>0){
                if(arr[i] ==2) a++;
                list.add(arr[i]);
                //if(a >= 2) break;
            }
        }
        if(a ==1){
        int[] answer = {list.get(0)};
        return answer; 
            
        }else if(a>=1){
            //2~2
            for(int i=list.size()-1; i>= 0; i--){
                if(list.get(i) == 2){
                    break;
                }else{
                    list.remove(i);
                }
            }
            return list.stream().mapToInt(i->i).toArray();
        }else{
            int[] answer = {-1};
           return answer;
        }
        
    }
}