import java.util.*;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String[] words = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
         
        // 단어와 숫자 Map
        Map<String, Integer> wordToNum = new HashMap<>();
        for(int k=0; k<words.length; k++) {
            wordToNum.put(words[k], k);
        }
         
        int t = sc.nextInt(); // 테스트 케이스 갯수
         
        for(int i=1; i<=t; i++) {
            sc.next(); // #기호와 테스트 번호 입력받기
             
            int n = sc.nextInt(); // 단어의 갯수
             
            sc.nextLine();
             
            String arr[] = new String[n];
             
            for(int j=0; j<n; j++) {
                arr[j] = sc.next();
            }
             
            Arrays.sort(arr, Comparator.comparingInt(wordToNum::get)); // 정렬
             
             
            // 출력
            System.out.println("#" + i);
            for (String word : arr) {
                System.out.print(word + " ");
            }
            System.out.println();
             
        }
        sc.close();
    }
}