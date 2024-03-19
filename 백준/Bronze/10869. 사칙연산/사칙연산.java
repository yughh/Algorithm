import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int[] num = new int[2];
        num[0] = Integer.parseInt(st.nextToken());
        num[1] = Integer.parseInt(st.nextToken());
        
        System.out.println(num[0]+num[1]);
        System.out.println(num[0]-num[1]);
        System.out.println(num[0]*num[1]);
        System.out.println(num[0]/num[1]);
        System.out.println(num[0]%num[1]);
    }
}