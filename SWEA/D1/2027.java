import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        
        for(int i=0; i<5; i++){
            
            for(int j=0; j<i; j++){
                System.out.print("+");
            }
            
            System.out.print("#");
            
            for(int k=0; k<4-i; k++){
                System.out.print("+");
            }
            
            System.out.println();
           
        }

	}
}