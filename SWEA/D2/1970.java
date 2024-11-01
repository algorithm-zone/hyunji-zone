import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
        int N = 0;
        int[] moneys = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int[] counts = new int[moneys.length];
        
        for(int i=1; i<=T; i++){
            N = sc.nextInt();
            
            for(int j =0; j<moneys.length; j++){
                counts[j] = N / moneys[j];
                N = N - (counts[j] * moneys[j]);
            }
            
            // 출력
            System.out.println("#" + i);
            for(int k = 0; k< moneys.length; k++){
                System.out.print(counts[k] + " ");
            }
            System.out.println();
        }
        
        sc.close();
	}
}