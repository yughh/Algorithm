import java.util.*;

class Solution {
    public String solution(String my_string) {
        String s = "";
        String[] temp = my_string.split("a");
        for(int i=0; i<temp.length; i++){
            s += temp[i];
        }
        String[] temp1 = s.split("e");
        s = "";
        for(int i=0; i<temp1.length; i++){
            s += temp1[i];
        }
        String[] temp2 = s.split("i");
          s = "";
        for(int i=0; i<temp2.length; i++){
            s += temp2[i];
        }
        String[] temp3 = s.split("o");
          s = "";
        for(int i=0; i<temp3.length; i++){
            s += temp3[i];
        }
        String[] temp4 = s.split("u");
          s = "";
        for(int i=0; i<temp4.length; i++){
            s += temp4[i];
        }
        return s;
    }
}