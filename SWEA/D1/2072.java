import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
         
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
         
        int[] arr = new int[10];
         
         
        for(int i=1; i<=T; i++){
            int sum = 0; // sum 초기화. 두번째 루프 시작 전에 초기화 시켜야 함
             
            for(int j=0; j<10; j++){
                arr[j] = sc.nextInt();
                if(arr[j] % 2 == 1)
                    sum += arr[j];
            }
             
            System.out.println("#" + i + " " + sum);
             
        }
         
        sc.close();
    }
}