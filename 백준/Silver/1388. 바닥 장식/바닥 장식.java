import java.util.*;

class Main{
	static String [][] arr;
	static boolean[][] visited;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] info = sc.nextLine().split(" ");
        
        arr = new String[Integer.parseInt(info[0])][Integer.parseInt(info[1])];
        visited = new boolean [Integer.parseInt(info[0])][Integer.parseInt(info[1])];
        
        int idx = 0;
        while(idx < Integer.parseInt(info[0])){
            arr[idx] = sc.nextLine().split("");
            idx++;
        }
        
        
        
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
        	 for(int j=0; j<arr[i].length; j++){
        		if(visited[i][j]) continue;	//방문한 곳이면 아무것도 하지 않음
        		if(arr[i][j].equals("-") ) dfs(i, j, "-"); //같은 타일만 visit
        		else dfs(i, j, "|");	//같은 타일만 visit
        	
        		 cnt++; // 같은 타일끼리 방문을 마치면 하나 추가 
              }
         }
       
        System.out.println(cnt);
        
    }
    
    static void dfs (int i, int j, String s){  //같은 종류의 연속된 장식을 모두 방문 표시
    	if(s.equals(arr[i][j])) {
    		visited[i][j] = true;
    		if(s.equals("-"))  {
    			if(j+1 >= arr[0].length) return;
    			dfs(i, j+1, "-");
    		}
    		else {
    			if(i+1 >= arr.length) return;
    			dfs(i+1, j, "|");
    		}
    	}else {
    		return;
    	}
    }
}