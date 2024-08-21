import java.util.*;

public class Main {
  public static void main(String[] args){
	  Scanner sc = new Scanner (System.in);
	  int n = Integer.parseInt(sc.nextLine());
	  int m= n;
	  String[] arr = new String[n];
	  for(int i=0; i<n; i++) {
		  arr[i]=sc.nextLine();
	  }
	 
	 for(int i=0; i<n; i++) {
		 String s = arr[i];
		 char a = s.charAt(0);
		 for(int j=0; j<arr[i].length(); j++) {
			 if(s.indexOf(a) == 0) {
				 s=s.substring(1);
			 }else if(s.indexOf(a) == -1) {
				 a= s.charAt(0);
			 }else {
				 m--;
				 break;
			 }
			
		 }
	 }
	  
	 System.out.println(m);
	  
    return ;
  }
}