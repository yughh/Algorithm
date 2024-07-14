class Solution {
    public String[] solution(String[] str_list) {
        String[] answer2 = {};
        String s ="";
        int temp = 0;
        for(int i=0; i<str_list.length; i++){
             s += str_list[i];
            if(str_list[i].equals("r") && temp == 0){
                temp = 1;
                s ="";
            }
            if(str_list[i].equals("l") && temp == 0){
                s = s.substring(0, i);
                temp =1;
                break;
            }
           
        }
         String[] answer = s.split("");
        if(s.equals("") || temp == 0) return answer2;
        return answer;
    }
}