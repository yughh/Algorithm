import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public String solution(String s) throws IOException{
        String answer = "";
        String str[] = s.split(" ");
        ArrayList list = new ArrayList();
        for(int i=0; i<str.length; i++){
            System.out.println(str[i]);
            list.add(Integer.parseInt(str[i]) );
        }
        
        Collections.sort(list);
        String a =  list.get(0) +"";
        String b =  list.get(str.length-1) +"";
        answer = a +" "+ b;
        return answer;
    }
}