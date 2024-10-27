import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int A, B;
		A = sc.nextInt();
        B = sc.nextInt();
		
		
            if(A > B)
                System.out.println("A");
            else if(A < B)
                System.out.println("B");
            else
                return;
		
	
	}
}