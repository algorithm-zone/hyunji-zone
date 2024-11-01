import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
        int hour1 =0, min1 = 0, hour2 = 0, min2 = 0;
        
        for(int i=1; i<=T; i++){
            hour1 = sc.nextInt();
            min1 = sc.nextInt();
            hour2 = sc.nextInt();
            min2 = sc.nextInt();
            
            int resultHour = 0;
            int resultMin = 0;
            int totalMins = 0; // 시간까지 분으로 표현하여 계산, 12시간제 적용하여 결과 반환 => 단위를 환산해서 계산할 수 있음
            
            totalMins = (hour1 * 60 + min1) + (hour2 * 60 + min2);
            
            resultHour = totalMins / 60;
            if(resultHour > 12)
                resultHour = resultHour - 12;
            if(resultHour == 0){
                resultHour = 12;
            }
            
            resultMin = totalMins % 60;
            
            // 출력
			System.out.printf("#%d %d %d\n", i, resultHour, resultMin);
        }
		
	sc.close();
	}
}