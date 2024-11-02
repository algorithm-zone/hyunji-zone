import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
        String word = "";
        for(int i=1; i<=T; i++){
            word = sc.next();
            int result = 0;
            
            // 문자열을 뒤집어서 비교
            String reverseWord = new StringBuilder(word).reverse().toString();
       
            if(word.equals(reverseWord))
                result = 1;
              
            // 출력
            System.out.println("#" + i + " " + result);
        }
        
	}
}