import java.util.Scanner;

class Solution{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i=1; i<=T; i++){
            int test_case = sc.nextInt(); // 테스트 케이스 번호
            
            int score[] = new int[1000];
            int[] frequency = new int[101];
            
            for(int j=0; j<1000; j++){
                score[j] = sc.nextInt(); // 각 테스트 케이스 별 점수 입력받기
                frequency[score[j]]++;
            }
            
            int result = 0; // 최빈수
            int maxFrequency = 0;
            
            // 최빈수 찾기
            for(int k=0; k<101; k++){
                if(frequency[k] > maxFrequency ||
                   (frequency[k] == maxFrequency && k > result)){
                    maxFrequency = frequency[k];
                    result = k;
                }
                
            }
            
            // 출력
            System.out.println("#" + i + " " + result);
        }
        
        
    }
}