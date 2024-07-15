class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i =0; i<myString.length(); i++){
            String s = myString;
            if(i+pat.length()-1 < myString.length()){
                if((s.substring(i, i+pat.length())).equals(pat)){
                    answer++;
                }
            }
        }
        return answer;
    }
}