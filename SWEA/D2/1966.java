import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
        for(int i=1; i<=T; i++){
            
            int N = sc.nextInt();
            int arr[] = new int[N];
            
            
            for(int j=0; j<N; j++){
            	arr[j] = sc.nextInt();          
            }
            Arrays.sort(arr);    
            
            System.out.print("#" + i + " ");
            
            for(int k=0; k<N; k++){
                System.out.print(arr[k] + " ");
            }
            
            System.out.println();

        }
        
        sc.close();
	}
}