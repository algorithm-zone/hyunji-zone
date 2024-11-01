import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] arr = new int[10];
        
        for(int i=1; i<=T; i++){
            
            for(int j=0; j<10; j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            
            int sum = 0;
            for(int j=1; j<9; j++){
                sum += arr[j];
            }
            
            int avg = Math.round(sum / 8.0f); // 반올림하는 매서드 Math.round()
            
            System.out.println("#" + i + " " + avg);
        }
        
        sc.close();
	}
}