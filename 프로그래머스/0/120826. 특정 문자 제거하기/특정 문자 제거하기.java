class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] temp = my_string.split(letter);
        for(String s : temp){
            answer += s;
        }
        return answer;
    }
}