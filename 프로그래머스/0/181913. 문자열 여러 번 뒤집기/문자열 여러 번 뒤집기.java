class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String[] s = my_string.split("");
        for(int i=0; i<queries.length; i++){
            for(int j=0; j<= (queries[i][1]-queries[i][0])/2; j++){ 
                String temp = s[queries[i][1]-j]; 
                s[queries[i][1]-j] = s[j+ queries[i][0]]; 
                s[j+ queries[i][0]]= temp;                 
            }
        }
        for(String ss : s){
            answer += ss;
        }
        return answer;
    }
}