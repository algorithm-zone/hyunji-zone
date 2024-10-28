import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T; // 테스트 케이스 개수
		T=sc.nextInt();
        
        int A[] = new int[T];
        int B[] = new int[T];
		
		for(int test_case = 0; test_case <T; test_case++)
		{
            
            A[test_case] = sc.nextInt();
            B[test_case] = sc.nextInt();
           
		}
        
        for(int i=0; i<T; i++){
            
            System.out.print("#" + (i+1) + " ");
            System.out.print(A[i] / B[i] + " ");
            System.out.println(A[i] % B[i]);
            
        }
        
        sc.close();
        
        
	}
}