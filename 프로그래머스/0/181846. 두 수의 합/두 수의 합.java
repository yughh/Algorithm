import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        
        BigInteger de = new BigInteger(a);
        BigInteger de2 = new BigInteger(b);
        
        String answer = String.valueOf(de.add(de2));
        return answer;
    }
}