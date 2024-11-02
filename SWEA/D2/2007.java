import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
        String str;
        for(int i=1; i<=T; i++){
            str = sc.next();
            
            for(int j=1; j<=str.length(); j++){
                String a = str.substring(0,j);
                String b = str.substring(j, j+j);
                if(a.equals(b)){
                    System.out.println("#" + i + " " + a.length());
                    break;
                }
            }
            
            
        }
        
        sc.close();
	}
}