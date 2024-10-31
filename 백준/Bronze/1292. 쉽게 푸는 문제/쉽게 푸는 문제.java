import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList();
        
        for(int i=1; i<=1000; i++){
            for(int j=0; j<i; j++){
                list.add(i);
            }
            if(list.size() > 1000 ) break;
        }
        int answer = 0;
        for(int i=n-1; i<m; i++){
        	//System.out.println(list.get(i));
            answer += list.get(i);
        }
        
        System.out.println(answer);
    }
}