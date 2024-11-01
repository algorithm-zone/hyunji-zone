import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
        for(int k=1; k<=T; k++){
            
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            int[] A = new int[N];
            int[] B = new int[M];
            
            for(int i=0; i<N; i++){
                A[i] = sc.nextInt();
            }
            
            for(int j = 0; j<M; j++){
                B[j] = sc.nextInt();
            }
            
            int max = 0;
            
            if (N < M) { // N이 M보다 작은 경우
                // 작은 배열 A를 B의 부분 배열과 곱하여 최대 값 찾기
                for (int start = 0; start <= M - N; start++) {
                    int sum = 0;
                    for (int i = 0; i < N; i++) {
                        sum += A[i] * B[start + i];
                    }
                    max = Math.max(max, sum);
                }
            } else if (N > M) { // N이 M보다 큰 경우
                // 작은 배열 B를 A의 부분 배열과 곱하여 최대 값 찾기
                for (int start = 0; start <= N - M; start++) {
                    int sum = 0;
                    for (int i = 0; i < M; i++) {
                        sum += A[start + i] * B[i];
                    }
                    max = Math.max(max, sum);
                }
            } else {
                // N과 M이 같은 경우
                for (int i = 0; i < N; i++) {
                    max += A[i] * B[i];
                }
            }
            // 출력
            System.out.println("#" + k + " "  + max);
        }
        
        sc.close();
	}
}