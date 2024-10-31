import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int i =1; i<=T; i++){
            int month1 = 0, month2 = 0, day1 = 0, day2 = 0;
            int result = 0;
            int date1 =0, date2 = 0;
            
            month1 = sc.nextInt();
            day1 = sc.nextInt();
            month2= sc.nextInt();
            day2 = sc.nextInt();
            
            // 1년은 365일 이니깐 배열로 날짜를 365중에 몇번째인지 나타내기
            for(int j=0; j<month1-1; j++){
                date1 += day[j];
            }
            date1 += day1;
            
            for(int j=0; j<month2-1; j++){
                date2 += day[j];
            }
            date2 += day2;
            
            result = date2 - date1 + 1;
            
            System.out.println("#" + i + " " + result);
        }
        
        sc.close();
	}
}