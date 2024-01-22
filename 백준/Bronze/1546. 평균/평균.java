import java.util.*;

public class Main {

	public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String str = scan.nextLine();
        String[] arr = str.split(" ");	
        
        Double[] sum = new Double[n];
        
        for(int i =0; i<arr.length; i++){
        	sum[i] = Double.parseDouble(arr[i]);
        }
        //내림차순 reverseOrder() 사용하려면 double X Double O
        Arrays.sort(sum, Collections.reverseOrder());
        double max = sum[0];
        double avg = 0.0;
        for(int i=0; i<n; i++) {
        	avg += sum[i]/max*100.0;
        }
        
        
        System.out.println(avg/n);
        
        
    }
}
