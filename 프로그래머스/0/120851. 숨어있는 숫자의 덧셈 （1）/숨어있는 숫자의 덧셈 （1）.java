class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] arr = my_string.split("");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<num.length; j++){
                if(num[j].equals(arr[i])){
                    answer += Integer.parseInt(num[j]);
                }
            }
           
        }
        return answer;
    }
}