import java.util.*;

public class Main {

	public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        
        int sum =0;
        
        for(int i =0; i<n; i++){
            sum += str.charAt(i)-'0';
        }
        
        System.out.println(sum);
        
        
    }
}
