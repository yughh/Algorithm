class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
       // char[] ca = my_string.toCharArray();
        
        for(char c ='A'; c<= 'Z'; c++){
            for(char cc : my_string.toCharArray()){
                if(c == cc){
                    answer[(int)c-'A']++;
                }
            }
        }
        for(char c='a'; c<= 'z'; c++){
            for(char cc : my_string.toCharArray()){
                if(c == cc){
                    answer[((int)c-'a')+26]++;
                }
            }
        }
        
        
        return answer;
    }
}
