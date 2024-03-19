import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
 
        if(num >= 90){
            System.out.println("A");
        }else if(num >= 80){
            System.out.println("B");
        }else if(num >= 70){
            System.out.println("C");
        }else if(num >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}