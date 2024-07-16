import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int temp = arr.length;
        int temp2 = 1000;
        int idx = 0;
        while(temp >= 2){
            if(temp != 1 && temp%2 == 0){//나눌게 더 있다
                temp /= 2;
            }else if(temp != 1 && temp%2 == 1){    //  제곱급이 아니다
                //가까운 제곱근 찾기
                temp = 0;
                break;
            }
        }
        
          System.out.println(temp);
        
        if(temp == 0){
            for(int i=2; i<=1024; i *= 2){
                temp = Math.abs(arr.length-i);
                if(temp<temp2 && arr.length<i) {
                    idx = i;
                    temp2 = temp;
                }
            }
        }else{
            idx = arr.length;
        }
        
        int[] answer = Arrays.copyOf(arr, idx);
        
        
        return answer;
    }
}