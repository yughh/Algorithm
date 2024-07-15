class Solution {
    public int solution(int[] arr1, int[] arr2) {
        //int answer = 0;
        if(arr1.length > arr2.length) return 1;
        else if(arr1.length< arr2.length) return -1;
        else{
            int a = 0;
            int b = 0;
            for(int i : arr1){
                a+= i;
            }
            for(int i : arr2){
                b+= i;
            }
            
            if(a == b) return 0;
            else if(a > b) return 1;
            else return -1;
        }
        
        //return answer;
    }
}