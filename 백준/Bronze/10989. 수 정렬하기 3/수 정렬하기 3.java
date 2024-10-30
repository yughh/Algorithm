import java.util.*;
import java.io.*;
class Main{
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(br.readLine());//st.nextToken());
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());//st.nextToken());
        }

        Arrays.sort(arr);
        
       StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++){
        	sb.append(arr[i]).append("\n");
        }
        
        System.out.println(sb);
        
    }
}