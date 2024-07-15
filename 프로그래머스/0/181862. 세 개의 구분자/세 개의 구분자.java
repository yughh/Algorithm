import java.util.*;
class Solution {
    public String[] solution(String myStr) {        
        String temp = myStr.replace("a", "A").replace("b", "A").replace("c", "A");
        String[] temp1 = temp.split("A");
        List<String> list = new ArrayList();
        for(String s : temp1){
            if(s.equals("")){
                
            }else{
                list.add(s);
            }
        }
        String[] answer = list.stream().toArray(String[]::new);
        if(answer.length == 0){//answer.isEmpty()){  //answer[0].isEmpty() //크기가 0이면 length로 해야함
            String[] answer2 = {"EMPTY"};
            return answer2;
        } 
        return answer;
    }
}