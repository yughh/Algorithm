import java.util.List; 
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> num = new ArrayList();
        for(int i = 0; i<arr.length; i++){
            if(num.isEmpty()){
                num.add(arr[i]);
            }else{
                if(num.get(num.size()-1) < arr[i]){
                    num.add(arr[i]);
                }else {
                    num.remove(num.size()-1);
                    i--;    
                 }
            }
        }
        
        int[] stk = num.stream().mapToInt(i -> i).toArray();
        return stk;
    }
}