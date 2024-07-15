class Solution {
    public String[] solution(String[] strArr) {
      
        String s ="";
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad")){
                
            }else{
                s += strArr[i]+" ";
            }
        }
          String[] answer = s.split(" ");
        return answer;
    }
}