class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char a : myString.toCharArray()){
            if(a<'l') answer +="l";
            else answer += a+"";
        }
        return answer;
    }
}