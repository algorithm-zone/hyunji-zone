import java.util.Scanner;
import java.util.Arrays;

class Solution{
    
    public static void main(String args[]) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 입력 받을 갯수
        sc.nextLine();
        if(N % 2 == 0 || N < 9 || N > 200)
            return;
        
        int arr[] = new int[N];
        
        String[] input = sc.nextLine().split(" "); // 한 줄에 입력받아 공백 기준으로 분리
        
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(input[i]); // 배열에 값 대입
        }
        
        // 중간 값 : 배열 정렬, 중간 인덱스 값 반환
        Arrays.sort(arr);
        int mid = N/2;
        System.out.println(arr[mid]);
        
        sc.close();
    }
}