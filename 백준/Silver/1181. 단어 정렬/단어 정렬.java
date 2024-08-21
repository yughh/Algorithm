import java.util.*;

public class Main {
  public static void main(String[] args){
	  Scanner sc = new Scanner (System.in);
	  int n = Integer.parseInt(sc.nextLine());
	  Map<String, Integer> map = new HashMap();
	  for(int i=0; i<n; i++) {
		  map.put(sc.nextLine(), 1);
	  }
	  String[] arr = new String[map.size()];
	  int i=0;
	  for(String s : map.keySet()) {
		  arr[i] = s;
		  i++;
	  }
	  
	  Arrays.sort(arr, (o1, o2) ->{
		  if(o1.length() != o2.length())return o1.length() - o2.length();
		  else return o1.compareTo(o2); 
	  });
	  
	  for(String s : arr) {
		  System.out.println(s);
	  }
	  
    return ;
  }
}