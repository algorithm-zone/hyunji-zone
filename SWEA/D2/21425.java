


import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
        long A, B, N;
        for(int i=1; i<=T; i++){
            A = sc.nextLong();
            B = sc.nextLong();
            N = sc.nextLong();
            
            int count = 0;
            
            // if(A < B){    // 이렇게 구현하면 시간 초과
            //     while(true){
            //         A += B;
            //         count ++;
            //         if(A > N)
            //             break;
            //     }
            // }else{
            //     while(true){
            //         B += A;
            //         count ++;
            //         if(B > N)
            //             break;
            // }
            // }
            
            // N보다 작을 때만 루프를 돌도록 해야 시간을 줄일 수 있음
            while (Math.max(A, B) <= N) {
                // 더 작은 수를 더 큰 수에 합산
                if (A < B) {
                    A += B;
                } else {
                    B += A;
                }
                count++;
            }
            System.out.println(count);
        }         
        sc.close();
	}
}