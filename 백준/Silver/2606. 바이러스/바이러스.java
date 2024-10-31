import java.util.*;
import java.io.*;
class Main{
	static int[] visited; //
	static void dfs(int[][] arr, int n) {
		if(n == arr.length ){
			
		}else {
            for(int i=0; i<arr.length; i++){
                if(arr[n][i] == 1 && visited[i] == 0){ //감염되어있어.. 그러면 가자 
                    visited[i] = 1;    
                    dfs(arr, i);
                }
            }
		}
		
	}
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int totalCom = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[totalCom][totalCom];
        visited = new int[totalCom];
        
        for(int i=0; i<n; i++) {
        	String[] tmp = br.readLine().split(" ");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);
            arr[a-1][b-1] = 1; //인접 행렬 
            arr[b-1][a-1] = 1; //인접 행렬 
         }
        
        dfs(arr, 0);
       int cnt =0;
        for(int i=1; i<visited.length; i++){
            if(visited[i] == 1) cnt++;
        }
        System.out.println(cnt);
    }
}