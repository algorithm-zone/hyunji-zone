

import java.util.*;

class Main
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			int k = sc.nextInt();
			
			int[][] table = new int[k][k];
			
			for(int x = 0; x<k; x++) {
				for(int y=0; y<k; y++) {
					table[x][y] = sc.nextInt(); // 입력 
				}	
			}
			
			int count = 0;
			
			// 로직
			for(int y=0; y<k; y++) {
                boolean one = false;
				for(int x=0; x<k; x++) {
					
                  if(table[x][y] == 1){
                      one = true;
                  } else if(one && table[x][y] == 2){
                      count ++;
                      one = false;
                  }

				}
			}
			
			System.out.println("#" + t + " " + count);
			
			
			
			
			
		}
	}
}
