import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] a = new int[30];
        
        for(String s : strArr){
            a[s.length()-1]++;
        }
        
        Arrays.sort(a);
        
        
        return a[a.length-1];
    }
}