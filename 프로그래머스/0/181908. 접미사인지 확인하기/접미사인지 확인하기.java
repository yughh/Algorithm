class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] s = new String[my_string.length()];
        
        for(int i=0; i<s.length; i++){
            String temp = my_string;
            if(is_suffix.equals(temp.substring(i, s.length))){
                answer = 1; 
                break;
            }
        }
        
        return answer;
    }
}