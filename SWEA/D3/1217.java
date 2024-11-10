import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		
        for(int t =1; t<=10; t++){
            
            int k = sc.nextInt();
            int a =0;
            int b= 0;
            
            a = sc.nextInt();
            b = sc.nextInt();
            
            int result = 1;
            
            for(int x = 0; x<b; x++){
                result *= a;
            }
            
            System.out.println("#" + t + " " + result); 
        }
	}
}