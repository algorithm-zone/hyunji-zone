import java.util.Scanner;
import java.util.StringTokenizer;

class Solution{
    
    public static void main(String args[]) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=1; i<=10; i++){
            sc.nextInt();
            String searchWord = sc.next();
            sc.nextLine();
            String sentence = sc.next();
            
            int count = 0;
            
            int index = sentence.indexOf(searchWord);
        	while (index != -1) {
            count++;
            index = sentence.indexOf(searchWord, index + 1);
        }
            
            System.out.println("#" + i + " " + count);
        }
   
        sc.close();
    }
}