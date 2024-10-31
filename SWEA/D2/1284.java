import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int P, Q, R, S, W = 0;
    
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
        for(int i = 1; i<=T; i++){
            
            int charge = 0;
            
            P = sc.nextInt();
            Q = sc.nextInt();
            R = sc.nextInt();
            S = sc.nextInt();
            W = sc.nextInt();
                
            if(companyA(W,P) < companyB(W,Q,R,S))
                charge = companyA(W,P);
             else
                 charge = companyB(W,Q,R,S);
            
            
			System.out.println("#" + i + " " + charge);
        }
		
	}
    
    // A사 요금 계산 메서드
    public static int companyA(int w, int p){
        return w*p;
    }
    
    // B사 요금 계산 메서드
    public static int companyB(int w, int q, int r, int s){
        if(w<r)
            return q;
        else
            return (q + (w-r)*s);
    }
    
}