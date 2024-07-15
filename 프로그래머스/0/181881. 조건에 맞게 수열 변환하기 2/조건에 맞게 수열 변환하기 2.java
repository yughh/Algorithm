class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int temp = 1;
        while(temp != 0){
            temp = 0;
            for(int i=0; i<arr.length; i++){
               if(arr[i] >= 50 && arr[i]%2 == 0) {
                   arr[i] = arr[i]/2;
                   temp++;                          
               }else if(arr[i] < 50 && arr[i]%2 == 1) {
                   arr[i] = (arr[i]*2) +1;
                   temp++;
               }
            }
            answer++;
        }        
        return answer-1;
    }
}