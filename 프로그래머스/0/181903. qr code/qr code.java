class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] temp = code.split("");
        for(int i=0; i<temp.length; i++){
            if(i%q == r){
                answer += temp[i];
            }
        }
        return answer;
    }
}