import java.util.Scanner;
import java.io.FileInputStream;
 
 
class Solution
{
     
    public static void main(String args[]) throws Exception
    {
         
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
         
        int num = 0;
         
         
        for(int i=1; i<=T; i++){
            num = sc.nextInt();
            int a = 0, b = 0, c=0, d=0, e = 0;
             
            while (num % 2 == 0) {
                num /= 2;
                a++;
            }
             
            while (num % 3 == 0) {
                num /= 3;
                b++;
            }
             
            while (num % 5 == 0) {
                num /= 5;
                c++;
            }
             
            while (num % 7 == 0) {
                num /= 7;
                d++;
            }
             
            while (num % 11 == 0) {
                num /= 11;
                e++;
            }
             
            System.out.println("#" + i + " " + a + " " + b + " " + c + " " + d + " " + e);
        }
         
         
    }
}