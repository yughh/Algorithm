import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
       Arrays.sort(strings, new Comparator<String>() {
        		@Override
        		public int compare(String o1, String o2) {
        			if( o1.charAt(n) > o2.charAt(n)) {
        				return 1;
        			}else if(o1.charAt(n) < o2.charAt(n)){
                        return -1;
                    }else{
                        return o1.compareTo(o2); //사전순 정렬
                    }
                }
		});
        
       answer = strings;
        
        return answer;
    }
}