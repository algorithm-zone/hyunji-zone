import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
         int N=0, M =0;
        
        for(int i=1; i<=T; i++){
            // 입력
            N = sc.nextInt();
            M = sc.nextInt();
            
            int[][] arr = new int[N][N];
            
            for(int j=0; j<N; j++){
                for(int z=0; z<N; z++){
                    arr[j][z] = sc.nextInt();
                }
            }
            
            // max 구하기
            int max = 0;
            
            for(int k=0; k<N-M+1; k++){
                for(int q = 0; q<N-M+1; q++){
                    
                    int sum = 0;
                    
                    for(int x = 0; x< M; x++){
                        for(int y=0; y< M; y++){
                            sum += arr[k+x][q+y];
                        }
                    }
                    
                    if(sum > max)
                	max = sum;
                }
            }
            
            
            
            // 출력
            System.out.println("#" + i + " " + max);
            
        }
            
        sc.close();
	}
}