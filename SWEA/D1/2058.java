import java.util.Scanner;

class Solution{
    
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        long number = sc.nextLong();
        
        long sum = 0;
        
        while (number > 0) {
            sum += number % 10; // 1의 자리부터 구하기
            number /= 10; // 1의자리수, 10의 자리수, 100의 자리수 순서대로 진행
        }
        
        System.out.println(sum);
        
        sc.close();
        
    }
}