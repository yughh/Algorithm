class Solution {
    public String solution(String code) {
        String answer = "";
        String[] codeIdx = code.split("");
    
        int mode = 0;
        for(int i=0; i<codeIdx.length; i++){
            if(mode == 0){
                if(codeIdx[i].equals("1") ){
                    mode = 1; 
                }else{
                    if(i%2 == 0){
                        answer +=codeIdx[i];
                    }
                }
            }else{
                if(codeIdx[i].equals("1")){
                    mode = 0; 
                }else{
                    if(i%2 == 1){
                        answer +=  codeIdx[i];
                    }
                }
            }
        }
        if(answer.equals("") || answer.equals(" ") ){
            return answer = "EMPTY";
        }
        
        return answer;
    }
}