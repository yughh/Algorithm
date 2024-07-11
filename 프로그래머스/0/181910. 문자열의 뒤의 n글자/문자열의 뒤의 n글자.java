class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        String[] s = my_string.split("");
        for(int i=s.length-n; i<s.length; i++){
            answer += s[i];
        }
        return answer;
    }
}