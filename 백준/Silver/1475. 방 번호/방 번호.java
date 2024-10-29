import java.util.*;

class Main{
    public static void main (String[] arg){
    	Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("");
        int[] n = new int[10];
        int answer = 0;
      
        
        for(int i=0; i<arr.length; i++){
        	int num = Integer.parseInt(arr[i]);
            n[num]++;
        }
        
        int t = (n[9]+n[6] +1 )/2;
        n[9] = t;
        n[6] = t;
        for(int i=0; i<n.length; i++) {
        	if(answer < n[i]) answer = n[i];
        }
        
        System.out.println(answer);
    }
}