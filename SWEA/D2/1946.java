import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt(); // 테스트케이스 개수
        
        
        for(int i=1; i<=T; i++){
            int N = sc.nextInt();
            
            ArrayList<String> arr = new ArrayList<>();
            for(int j = 0; j<N; j++){
                String Cj = sc.next();
                int Kj = sc.nextInt();
                
                for(int z = 0; z<Kj; z++){
                    arr.add(Cj);
                }
                
            }
            
            System.out.println("#" + i);
            
            // arr을 한줄에 10개씩 출력
            for(int z=0; z<arr.size(); z++){
                System.out.print(arr.get(z));
                if((z+1) % 10 == 0){
                    System.out.println();
                }
            }
            System.out.println();
        }
		
        sc.close();
	}
    
    
}