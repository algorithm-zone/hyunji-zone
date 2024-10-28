import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int P;
        int K;
		P = sc.nextInt();
        K = sc.nextInt();
		
		System.out.println(P - K + 1);
		
	}
}