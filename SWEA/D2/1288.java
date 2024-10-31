import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
        long N =0;
        int result = 0;
        
        for(int i=1; i<=T; i++){
            N = sc.nextLong();
            
            // N의 배수를 세면서 0에서 9까지의 모든 숫자를 보는 것은 result번째
            
            // 본 숫자 배열
            ArrayList<Integer> arr = new ArrayList<>(); // 동적할당
            
            int x = 1;
            long num = 0;
            
            // N 곱하기 무한히 증가. 그 숫자를 쪼개서 ArrayList에 없는거를 추가. ArrayList가 10개가 되면 break
            while(true){
                num = N * x;
                String numStr = String.valueOf(num);
                
                // ArrayList에 숫자를 중복되지 않도록 저장
                for (char ch : numStr.toCharArray()) {
                    int digit = Character.getNumericValue(ch);
                    if (!arr.contains(digit)) {
                        arr.add(digit);
                    }
                }

                if(arr.size() == 10){
                    result = (int) num;
                    break;
                }
                
                x++;
                   
            }
            
            
            System.out.println("#" + i + " " + result);
        }
        
        sc.close();
	}
}