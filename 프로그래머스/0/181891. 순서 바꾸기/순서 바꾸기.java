import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] a = Arrays.copyOfRange(num_list, 0, n);
        int[] b = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] answer = new int[a.length+ b.length];
        for(int i=0; i<b.length; i++){
            answer[i] = b[i];
        }
        for(int i=0; i<a.length; i++){
            answer[i+b.length] = a[i];
        }
        return answer;
    }
}