class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean a1 = true;
        boolean a2 = true;
        if(x1 == false && x2 == false) a1 = false;
        if(x3 == false && x4 == false) a2 = false;
        
        if(a1 == true && a2 == true) answer = true;
        return answer;
    }
}