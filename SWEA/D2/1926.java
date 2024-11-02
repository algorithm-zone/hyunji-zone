import java.util.Scanner;
 
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
         
        Scanner sc = new Scanner(System.in);
        int N;
        N=sc.nextInt();
         
        for(int i=1; i<=N; i++){
             
            String str = Integer.toString(i);
                  
            int count = 0;
             
            for (char c : str.toCharArray()) {
                if (c == '3' || c == '6' || c == '9') {
                    count++;
                }
            }
             
            if (count > 0) {
                for (int j = 0; j < count; j++) {
                    System.out.print("-");
                }
            } else {
                System.out.print(i);
            }
             
            System.out.print(" ");
             
             
        }
         
        sc.close();
    }
}