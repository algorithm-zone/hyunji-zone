import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
        int N = 0;
        for(int i=1; i<=T; i++){
            N = sc.nextInt();
            
            int[][] arr = new int[N+1][N+1];
            
            System.out.println("#" + i);
            
            for(int x=1; x<=N; x++){
                for(int y=1; y<=N; y++){
                    arr[0][0] = 1;
                    
                    arr[x][y] = arr[x-1][y-1] + arr[x-1][y];
                    
                    if(arr[x][y] != 0)
                        System.out.print(arr[x][y] + " ");
                }
                System.out.println();
            }
            
        }
        sc.close();
	}
}