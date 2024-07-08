class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa = a+"";
        String bb = b+"";
        if(Integer.parseInt(aa+bb) > Integer.parseInt(bb+aa)){
            answer = Integer.parseInt(aa+bb);
        }else{
            answer = Integer.parseInt(bb+aa);
        }
        return answer;
    }
}