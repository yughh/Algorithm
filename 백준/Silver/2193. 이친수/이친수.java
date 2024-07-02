import java.util.*;
import java.io.*;
class Main{
    public static void main (String[] arg) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int num = Integer.parseInt(st.nextToken());
        //System.out.println(num);
        
        ArrayList<Long> list = new ArrayList<Long>();
        list.add(1L);
        list.add(1L);
        for(int i=2; i<num; i++){
            list.add(list.get(i-1)+list.get(i-2));
        }

        System.out.println(list.get(list.size()-1));
        //한자리수면 모듈러 1                          1
       //두자리수면 10                              1
       //3자리수면 100 or 101                       2
       //4자리수면 1010 1001 1000                   3
       //5자리수면 10001 10101 10100 10000 10010    5
       //6자리수면 100001 100000 101010 101001 101000 100010 100101 100100  8
    }
}