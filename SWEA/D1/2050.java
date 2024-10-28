
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		String word;
		word = sc.next();
        
		for(int i = 0; i < word.length(); i++){
            System.out.print(word.charAt(i) - 64 + " ");
        }
	}
}