class Solution {
    public String solution(String myString, String pat) {
        String answer = myString.substring(0, myString.lastIndexOf(pat)).concat(pat);
        return answer;
    }
}