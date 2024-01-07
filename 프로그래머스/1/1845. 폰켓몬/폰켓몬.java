import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 1; 
        int max = nums.length / 2;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i+1 <nums.length && nums[i] != nums[i+1] ){
                answer++;
            }
        }
        if(answer> max) answer = max;
        
        return answer;
    }
}