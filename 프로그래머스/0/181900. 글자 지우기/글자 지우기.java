class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] s = my_string.split("");
        
        for(int i=0; i< indices.length; i++){
            s[indices[i]] ="";
        }
        answer = String.join("", s);
        return answer;
    }
}