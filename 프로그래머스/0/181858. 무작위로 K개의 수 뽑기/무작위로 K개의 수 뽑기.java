import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List <Integer> list = new ArrayList();
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(list.contains(arr[i]) == false){
                list.add(arr[i]);   
            }
            if(list.size() == k) break;
        }
        
        if(list.size() < k){
            idx = k-list.size();
            while(idx > 0){
                list.add(-1);
                idx--;
            }          
        }
            
        return list.stream().mapToInt(i->i).toArray();
    }
}