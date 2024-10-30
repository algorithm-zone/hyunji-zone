import java.util.Scanner;
import java.util.Arrays;
 
class Solution{
     
    public static void main(String args[]) throws Exception{
         
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
         
        for (int t = 1; t <= T; t++) {
            int[] arr = new int[10];  // 10개의 수를 저장할 배열
             
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }
             
            int max = Arrays.stream(arr).max().getAsInt();  // 최대값
             
            System.out.println("#" + t + " " + max);
        }
         
        sc.close();
    }
 
}