import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
        // 배열 선언
        ArrayList<Integer> result = new ArrayList<>();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            if(T % test_case == 0)
                result.add(test_case);
		}
        
    // 출력
       for(int i=0; i<result.size(); i++){
           System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(" ");
            }
       }
        
	}
}