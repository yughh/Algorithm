class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String [] con = control.split("");
        for(String s : con){
            if(s.equals("w")) n++;
            else if(s.equals("s")) n--;
            else if(s.equals("d")) n +=10;
            else if(s.equals("a")) n -=10;
        }
        return answer= n;
    }
}