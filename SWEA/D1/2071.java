import java.util.Scanner;
import java.io.FileInputStream;
 
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
         
        Scanner sc = new Scanner(System.in);
        int T; // 테스트 케이스 갯수
        T=sc.nextInt();
         
        int arr[] = new int[10];
         
         
        for(int i=1; i<=T; i++){
            int sum = 0;
            int avg = 0;
             
            for(int j=0; j<10; j++){
                arr[j] = sc.nextInt(); // 입력
                sum += arr[j];
                if(sum % 10 < 5){
                    avg = sum/10;
                }else{
                    avg = sum/10 +1;
                }
                 
            }
 
            System.out.println("#" + i + " " + avg);
        }
 
    }
}