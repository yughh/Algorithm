import java.util.*;
import java.io.*;
class Main{
    public static void main (String[] arg) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] minus = new int[2] ;
      
        minus[0] = Integer.parseInt(st.nextToken());
        minus[1] = Integer.parseInt(st.nextToken());
        System.out.println(minus[0]-minus[1]);
    }
}