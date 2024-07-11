class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
       String [][] temp = new String [my_string.length()/m][m];
        
        String[] s = my_string.split("");
        
        for(int i =0; i<s.length; i++ ){
             temp[i/m][i%m] = s[i];
        }
        
        for(int i=0; i<temp.length; i++){
             answer += temp[i][c-1];
        }
        return answer;
    }
    
}