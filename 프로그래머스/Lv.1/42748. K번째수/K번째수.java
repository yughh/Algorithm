import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
      int[] answer = new int[commands.length];  //commands 사이즈로 배열 
        
        List <Integer> arr = new ArrayList();   
        
        
        for(int i=0; i<commands.length; i++) {
        	for(int j=commands[i][0]-1; j<commands[i][1]; j++) {    //commads의 i번째의 1번째 원소 -1 부터 commands의 i번째의 2번째원소까지 
        		arr.add(array[j]);
        	}
        	//arr.sort((o1, o2) -> o1 - o2); 
            Collections.sort(arr);
            answer[i] = arr.get(commands[i][2]-1);
        	arr.clear();
        }
        
        return answer;
    }
}