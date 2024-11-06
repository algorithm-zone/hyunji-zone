import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		
        int[][] arr = new int[100][100];
        
        for(int i=1; i<=10; i++){
            sc.nextInt();
            
            for(int j=0; j<100; j++){
                for(int k=0; k<100; k++){
                    arr[j][k] = sc.nextInt();
                }
            }
            
            int result = 0; // 결과
            
            int mainDiagonalSum=0, antiDiagonalSum=0;
            
            int rowSumMax = 0, colSumMax = 0;
            
            // 각각 합 구하고
           for(int j=0; j<100; j++){
               int rowSum = 0;
               int colSum = 0;
                for(int k=0; k<100; k++){
                    rowSum += arr[j][k];
                    colSum += arr[k][j];
                }
               rowSumMax = Math.max(rowSumMax, rowSum);
               colSumMax = Math.max(colSumMax, colSum);
            }
                       
            for(int j=0; j<100; j++){
                mainDiagonalSum += arr[j][j];
                antiDiagonalSum += arr[j][99-j];
            }
           
            // 4개의 값 크기순으로 정렬해서 결과 반환     
            result = Math.max(Math.max(rowSumMax, colSumMax), Math.max(mainDiagonalSum, antiDiagonalSum));

            
            System.out.println("#" + i + " " + result);
            
        }
	}
}