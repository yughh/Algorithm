import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = 0;	//총 행 : 9 
		int temp = 0;
		int max =0;
		int x = 1;	//행
		int y = 1;	//열

		while(line < 9) {
			StringTokenizer st = new StringTokenizer(br.readLine());	//줄바꿈
			for(int i=0; i<9; i++) {
			temp = Integer.parseInt(st.nextToken());
				if(max < temp){
					max = temp;
					x = line+1;
					y = i+1;
				}
			}
			line++;
		}
		System.out.println(max);
		System.out.println(x+" "+y);
	}

}
