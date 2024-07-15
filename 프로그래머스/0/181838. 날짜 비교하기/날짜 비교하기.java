class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int da1 = 0;
        int da2 =0;
        for(int i=0; i<date1.length; i++){
            da1 +=date1[i];
            da2 += date2[i];
        }
        return da1< da2? 1 : 0;
    }
}