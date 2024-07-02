import java.util.*;
import java.io.*;

class Main{
  public static void main (String[] arg) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int num = Integer.parseInt(st.nextToken());
        long[] arr = new long[num+1];
        arr[0] = 1L;
        arr[1] = 1L;
        
        for(int i=2; i< arr.length; i++){
            arr[i] = (arr[i-2] + arr[i-1])%15746;
        }
        
        System.out.println(arr[num]);
        //0 1           1
        //1 , 1          1
        //2, 00 11       2
        //3, 100 001 111 3
        //4,             5
    }
}