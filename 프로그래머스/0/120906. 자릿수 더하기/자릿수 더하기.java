class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = n+"";
        String[] temp = s.split("");
        for(String t : temp){
            answer += Integer.parseInt(t);
        }
        return answer;
    }
}