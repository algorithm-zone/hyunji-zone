import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
        int N;
        for(int i=1; i<=T; i++){
            N = sc.nextInt();
            
            long[] arr = new long[N];
            
            for(int j=0; j<N; j++){
                arr[j] = sc.nextLong();
            }
            
            long maxProfit = 0;
            long maxPrice = 0;
            
            for(int k = N-1; k >= 0; k--){
                if(arr[k] > maxPrice){
                    maxPrice = arr[k];
                }else{
                    maxProfit += (maxPrice - arr[k]);
                }
            }

            System.out.println("#" + i + " " + maxProfit);
        }
        
	}
}