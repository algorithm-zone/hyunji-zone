import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        int arr[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        String str;
        int t; 	// 테스트 케이스 개수
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        
        for (int i = 1; i <= t; i++) {
            str = sc.next();
            int year = Integer.parseInt(str.substring(0,4));
            int month = Integer.parseInt(str.substring(4,6));
            int day = Integer.parseInt(str.substring(6,8));
            
            if(month >0 && month < 13 && day <= arr[month])
                System.out.println("#" + i + " " + getYear(year) + "/" + getMonth(month) + "/" + getDay(day));
            else
                System.out.println("#" + i + " -1");
            
        }
	}
    
    public static String getYear(int a){
        return String.format("%04d", a);
    }
    
    public static String getMonth(int b){
        return String.format("%02d", b);
    }
    
    public static String getDay(int c){
        return String.format("%02d", c);
    }
    
}