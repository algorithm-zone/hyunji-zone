import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        int result = 1;
		
		for(int test_case = 1; test_case <= T+1; test_case++)
		{
			
			System.out.print(result + " ");
            result *= 2;

		}
	}
}