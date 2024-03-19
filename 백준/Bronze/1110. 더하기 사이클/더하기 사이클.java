import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int num = Integer.parseInt(st.nextToken()); //26
        int newNum = num;
        boolean cycle = true;
        int cycleNum = 0;
    
    
    //26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.

        while(cycle){
           int temp = newNum;
            temp =temp/10 + temp%10; //8
            newNum = (newNum%10)*10 +temp%10;
        
            if(num == newNum){
                cycle = false;
            }else{
                cycleNum++;
            }
        }
        
        System.out.println(cycleNum+1);
        
        
    }
}