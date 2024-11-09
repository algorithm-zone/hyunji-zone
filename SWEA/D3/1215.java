import java.util.*;

class Solution
{
    
    public static boolean isPalindrome(String s){
		String reverse = new StringBuilder(s).reverse().toString();
		return s.equals(reverse);
	}
    
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++){
            
            // 입력
            int length = sc.nextInt();
            char arr[][] = new char[8][8];
            int count = 0;
            
            for(int i=0; i<8; i++)
			{
				String line = sc.next();
				for(int j=0; j<8; j++)
				{
					arr[i][j] = line.charAt(j);
				}
			}
            
            // 회문일 때 각 count++ => String 변환해서 reverse()랑 똑같으면 회문
            for(int x=0; x<8; x++){
                for(int y=0; y<=8-length; y++){
                    
                    StringBuilder sub = new StringBuilder();
                    
                    for(int k=y; k<y+length; k++){ // 부분 문자열 생성
                        sub.append(arr[x][k]);
                    }
                    
                    if(isPalindrome(sub.toString()))
					{
						count++;
					} 
                }
            }
            
            for(int y = 0; y<8; y++){
                for(int x=0; x<=8-length; x++){
                    
                    StringBuilder sub = new StringBuilder();
                    
                    for(int k=x; k<x+length; k++){
                        sub.append(arr[k][y]);
                    }
                    if(isPalindrome(sub.toString()))
					{
						count++;
					}
                }
            }
            
            // 출력
            System.out.println("#" + t + " " + count);
        }
        
        sc.close();
	}
}