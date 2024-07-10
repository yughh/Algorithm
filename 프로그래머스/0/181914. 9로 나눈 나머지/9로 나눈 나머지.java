class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] s = number.split("");
        for(String ss : s){
            answer += Integer.parseInt(ss);
        }
        answer = answer%9;
        return answer;
    }
}