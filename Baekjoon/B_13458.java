import java.util.*;

class B_13458{
    public static void main(String args[]) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 시험장 갯수

        int[] A = new int[t];

        for(int i=0; i<t; i++){ // 시험장 별 학생 수 
            A[i] = sc.nextInt();
        }

        int b = sc.nextInt(); // 총감독관이 감독할 수 있는 학생 수
        int c = sc.nextInt(); // 부감독관이 감독할 수 있는 학생 수

        long result = 0; // 결과 값 => 최소한의 감독수

        for(int i=0; i<t; i++){ // 시험장 별 학생 수 
            result += 1;

            int remains = A[i] - b;

            if (remains > 0) {
                result += (int) Math.ceil((double)remains / c); // Math.ceil()은 소수점 이하 값이 존재하면 항상 올림하여 결과 반환
            }
        }

        System.out.println(result);

    }

}