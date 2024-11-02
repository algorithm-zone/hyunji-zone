
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
        int N = 0;
        
        for(int i = 1; i<=T; i++){
            N = sc.nextInt();
            
            int result = 0;
            for(int j =1; j<=N; j++){
                if(j % 2 == 1){
                    result += j;
                }else{
                    result -= j;
                }
            }
            System.out.println("#" + i + " " + result);
        }
		
        sc.close();
	}
}