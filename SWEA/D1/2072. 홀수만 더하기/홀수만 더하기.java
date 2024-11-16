import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int[] arr = new int[T];

		for(int test_case = 1; test_case <= T; test_case++)
		{
			for(int i=0; i<10; i++){
            	int tmp = sc.nextInt();
                if(tmp%2 == 1){
                    arr[test_case-1] += tmp;
            	}
            }
        
			System.out.println("#"+test_case+" "+arr[test_case-1]);

		}
	}
}