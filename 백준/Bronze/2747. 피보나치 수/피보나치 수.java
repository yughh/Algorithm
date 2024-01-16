
import java.util.*;

public class Main {

	public static void main(String[] args) {
        
	Scanner scanner = new Scanner(System.in);
    String strX = scanner.nextLine();  
    int n = Integer.parseInt(strX); 
    List<Integer> list = new ArrayList<>();
    
    list.add(0);
    list.add(1);
    
    for(int i=2; i<=n; i++) {
       list.add(list.get(i-1) + list.get(i-2));
    }
    
    System.out.println(list.get(n));
	}

}
