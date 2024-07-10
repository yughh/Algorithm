class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int multiply = 1;
        for(int num : num_list){
            sum += num;
            multiply *= num;
        }
        if((sum*sum) > multiply){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}