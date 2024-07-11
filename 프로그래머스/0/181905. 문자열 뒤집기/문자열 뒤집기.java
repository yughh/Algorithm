class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        int ee = e;
        String [] temp = my_string.split("");
       for(int i=0; i<my_string.length(); i++){
           if(s <= i && i <= e){
               answer += temp[ee--];
           }else{
               answer += my_string.charAt(i)+"";
           }
       }
        // 6 7 8 9 10 11 12
        
        return answer;
    }
}

//Stanley1yelnatS