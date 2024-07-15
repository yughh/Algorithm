class Solution {
    public int[] solution(String myString) {
        //myString += myString="";
        String[] s =  myString.split("x");
        int[] answer = new int[myString.charAt(myString.length()-1)== 'x'? s.length+1 : s.length];
        
        for(int i=0; i<s.length; i++){
            answer[i] = s[i].length();
            System.out.println(s[i]);
        }
        
        return answer;
    }
}