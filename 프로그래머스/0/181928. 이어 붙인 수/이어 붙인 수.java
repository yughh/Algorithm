class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int even = 0;
        int odd = 0;
        int digit_even = 1;
        int digit_odd = 1;
        for(int n : num_list){
            if(n%2 == 0){
                digit_even *= 10;
            }else{
                digit_odd *= 10;
            }
        }
        for(int num : num_list){
            if(num%2 == 0){
                digit_even /= 10;
                even += num*digit_even;
                
            }else{
                digit_odd /= 10; 
                odd += num*digit_odd;
                
            }
            
        }
        answer = even + odd;
        return answer;
    }
}